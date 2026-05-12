package co.edu.uco.ucoparking.features.vehicletype.getvehicletype.application.usecase.domain;

import java.util.UUID;

import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.helper.ObjectHelper;
import co.edu.uco.ucoparking.crosscutting.helper.TextHelper;

public final class GetVehicleTypeDomain {

    private UUID id;
    private String name;

    public GetVehicleTypeDomain(UUID id, String name) {
        setId(id);
        setName(name);
    }

    private void setId(UUID id) {
        if (ObjectHelper.isNull(id)) {
            throw UcoParkingException.create(
                "El identificador del tipo de vehículo no es válido.",
                "GetVehicleTypesDomain.id: null"
            );
        }
        this.id = id;
    }

    private void setName(String name) {
        if (TextHelper.isBlank(name)) {
            throw UcoParkingException.create(
                "El nombre del tipo de vehículo no es válido.",
                "GetVehicleTypesDomain.name: blank or null"
            );
        }
        this.name = TextHelper.clean(name);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
