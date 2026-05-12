package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;

@Mapper(componentModel = "spring")
public interface AddVehicleDomainMapper {

    @Mapping(source = "source.id",    target = "id")
    @Mapping(source = "source.plate", target = "plate")
    @Mapping(source = "vehicleType",  target = "vehicleType")
    @Mapping(source = "customer",     target = "owner")
    VehicleEntity toEntity(AddVehicleDomain source, CustomerEntity customer, VehicleTypeEntity vehicleType);
}
