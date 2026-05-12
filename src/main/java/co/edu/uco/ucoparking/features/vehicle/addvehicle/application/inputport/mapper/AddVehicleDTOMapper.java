package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.mapper;

import org.mapstruct.Mapper;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;

@Mapper(componentModel = "spring")
public interface AddVehicleDTOMapper {

    AddVehicleDomain toDomain(AddVehicleDTO dto);
}
