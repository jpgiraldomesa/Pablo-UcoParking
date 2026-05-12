package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.mapper;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;

public final class AddVehicleDomainMapper {

    private AddVehicleDomainMapper() {}

    public static VehicleEntity toEntity(AddVehicleDomain source,
                                         CustomerEntity customer,
                                         VehicleTypeEntity vehicleType) {
        return new VehicleEntity(
                source.getId(),
                source.getPlate(),
                vehicleType,
                customer
                );
    }
}