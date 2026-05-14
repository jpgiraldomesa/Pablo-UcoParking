package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.mapper;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddVehicleDTOMapper {


    AddVehicleDomain toDomain(AddVehicleDTO data);
}
