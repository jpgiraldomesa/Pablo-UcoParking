package co.edu.uco.ucoparking.infrastructure.persistence.repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.IdTypeEntity;

import java.util.List;
import java.util.UUID;

public interface IdTypeRepository {
    void create(IdTypeEntity customer);
    void update(UUID id, IdTypeEntity customer);
    void delete(UUID id);

    List<IdTypeEntity> findAll();
    List<IdTypeEntity> findById(UUID id);
    List<IdTypeEntity> findByFilter(IdTypeEntity customer);
}
