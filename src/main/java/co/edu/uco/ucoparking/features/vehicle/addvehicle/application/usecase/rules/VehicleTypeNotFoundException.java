package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.rules;

import java.util.UUID;

import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;

public final class VehicleTypeNotFoundException extends UcoParkingException {

    private static final long serialVersionUID = 1L;

    private VehicleTypeNotFoundException(String userMessage, String technicalMessage) {
        super(userMessage, technicalMessage, 404);
    }

    public static VehicleTypeNotFoundException create(UUID vehicleTypeId) {
        return new VehicleTypeNotFoundException(
            "El tipo de vehículo seleccionado no existe.",
            "AddVehicle: vehicleType not found with id=" + vehicleTypeId
        );
    }
}
