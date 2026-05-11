package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.IdTypeEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.OrganizationEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.CustomerJPAEntity;

public final class CustomerEntityMapper {

    private CustomerEntityMapper() {}

    public static CustomerJPAEntity toJPA(CustomerEntity source) {
        return new CustomerJPAEntity(
                source.getId(),
                source.getName(),
                source.getLastname(),
                source.getEmail(),
                source.getPhonenumber(),
                source.getIdNumber(),
                IdTypeEntityMapper.toJPA(source.getIdType()),
                OrganizationEntityMapper.toJPA(source.getOrganization())
        );
    }

    public static CustomerEntity toDomain(CustomerJPAEntity source) {
        return new CustomerEntity(
                source.getId(),
                source.getName(),
                source.getLastname(),
                source.getEmail(),
                source.getPhonenumber(),
                source.getIdNumber(),
                IdTypeEntityMapper.toDomain(source.getIdType()),
                OrganizationEntityMapper.toDomain(source.getOrganization())
        );
    }
}