package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.OrganizationEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.OrganizationJPAEntity;

public final class OrganizationEntityMapper {

    private OrganizationEntityMapper() {}

    public static OrganizationJPAEntity toJPA(OrganizationEntity source) {
        return new OrganizationJPAEntity(
                source.getId(),
                source.getName()
        );
    }

    public static OrganizationEntity toDomain(OrganizationJPAEntity source) {
        return new OrganizationEntity(
                source.getId(),
                source.getName()
        );
    }
}