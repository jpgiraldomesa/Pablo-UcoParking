package co.edu.uco.ucoparking.infrastructure.persistence.repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.OrganizationEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.OrganizationJPAEntity;

import java.util.List;
import java.util.UUID;

public interface OrganizationRepository {
    void create(OrganizationEntity customer);
    void update(UUID id, OrganizationEntity customer);
    void delete(UUID id);

    List<OrganizationEntity> findAll();
    List<OrganizationEntity> findById(UUID id);
    List<OrganizationEntity> findByFilter(OrganizationEntity customer);
}
