package co.edu.uco.ucoparking.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.OrganizationEntity;

public interface OrganizationRepository {
    void create(OrganizationEntity customer);
    void update(UUID id, OrganizationEntity customer);
    void delete(UUID id);

    List<OrganizationEntity> findAll();
    List<OrganizationEntity> findById(UUID id);
    List<OrganizationEntity> findByFilter(OrganizationEntity customer);
}
