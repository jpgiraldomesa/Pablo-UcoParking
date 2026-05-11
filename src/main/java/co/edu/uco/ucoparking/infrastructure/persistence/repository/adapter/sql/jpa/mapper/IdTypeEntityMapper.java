package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.IdTypeEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.IdTypeJPAEntity;

public final class IdTypeEntityMapper {

    private IdTypeEntityMapper() {}

    public static IdTypeJPAEntity toJPA(IdTypeEntity source) {
        return new IdTypeJPAEntity(
                source.getId(),
                source.getName()
        );
    }

    public static IdTypeEntity toDomain(IdTypeJPAEntity source) {
        return new IdTypeEntity(
                source.getId(),
                source.getName()
        );
    }
}