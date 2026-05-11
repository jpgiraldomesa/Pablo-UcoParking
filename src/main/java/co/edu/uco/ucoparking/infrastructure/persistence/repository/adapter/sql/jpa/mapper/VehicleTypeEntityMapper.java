package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.VehicleTypeJPAEntity;

public final class VehicleTypeEntityMapper {

    private VehicleTypeEntityMapper() {}

    public static VehicleTypeJPAEntity toJPA(VehicleTypeEntity source) {
        return new VehicleTypeJPAEntity(
                source.getId(),
                source.getName()
        );
    }

    public static VehicleTypeEntity toDomain(VehicleTypeJPAEntity source) {
        return new VehicleTypeEntity(
                source.getId(),
                source.getName()
        );
    }
}