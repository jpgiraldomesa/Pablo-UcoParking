package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.VehicleJPAEntity;

public final class VehicleEntityMapper {

    private VehicleEntityMapper() {}

    public static VehicleJPAEntity toJPA(VehicleEntity source) {
        return new VehicleJPAEntity(
                source.getId(),
                CustomerEntityMapper.toJPA(source.getCustomer()),
                source.getPlate(),
                VehicleTypeEntityMapper.toJPA(source.getVehicleType())
        );
    }

    public static VehicleEntity toDomain(VehicleJPAEntity source) {
        return new VehicleEntity(
                source.getId(),
                source.getPlate(),
                CustomerEntityMapper.toDomain(source.getCustomer()),
                VehicleTypeEntityMapper.toDomain(source.getVehicleType())
        );
    }
}