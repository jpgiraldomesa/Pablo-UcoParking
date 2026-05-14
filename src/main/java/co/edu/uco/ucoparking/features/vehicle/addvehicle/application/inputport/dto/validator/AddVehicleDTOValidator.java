package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.validator;

import java.util.UUID;

import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.helper.TextHelper;
import co.edu.uco.ucoparking.crosscutting.helper.UUIDHelper;

public final class AddVehicleDTOValidator {

    // Carro: ABC123 | Moto: ABC12A | Moto antigua: ABC12
    private static final String PLATE_PATTERN = "^[A-Z]{3}[0-9]{2}[A-Z0-9]?$";

    private AddVehicleDTOValidator() {
    }

    public static String cleanAndValidatePlate(String plate) {
        String cleaned = TextHelper.cleanAndUpperCase(plate);

        if (TextHelper.isBlank(cleaned)) {
            throw UcoParkingException.create(
                "La placa del vehículo es obligatoria.",
                "AddVehicleDTO.plate: blank or null");
        }
        if (TextHelper.isBelowMinLength(cleaned, 5)) {
            throw UcoParkingException.create(
                "La placa debe tener mínimo 5 caracteres.",
                "AddVehicleDTO.plate: length < 5");
        }
        if (TextHelper.exceedsMaxLength(cleaned, 6)) {
            throw UcoParkingException.create(
                "La placa no puede superar 6 caracteres.",
                "AddVehicleDTO.plate: length > 6");
        }
        if (TextHelper.doesNotMatchPattern(cleaned, PLATE_PATTERN)) {
            throw UcoParkingException.create(
                "El formato de placa no es válido. Use ABC123 (carro), ABC12A (moto) o ABC12 (moto antigua).",
                "AddVehicleDTO.plate: does not match " + PLATE_PATTERN);
        }

        return cleaned;
    }

    public static void validateVehicleType(UUID vehicleType) {
        if (UUIDHelper.isNull(vehicleType)) {
            throw UcoParkingException.create(
                "El tipo de vehículo es obligatorio.",
                "AddVehicleDTO.vehicleType: null");
        }
    }

    public static void validateOwner(UUID owner) {
        if (UUIDHelper.isNull(owner)) {
            throw UcoParkingException.create(
                "El propietario del vehículo es obligatorio.",
                "AddVehicleDTO.owner: null");
        }
    }
}
