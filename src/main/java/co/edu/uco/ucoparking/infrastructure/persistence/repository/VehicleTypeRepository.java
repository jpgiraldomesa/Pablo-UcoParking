package co.edu.uco.ucoparking.infrastructure.persistence.repository;


import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;

import java.util.List;
import java.util.UUID;

public interface VehicleTypeRepository {
    void create(VehicleTypeEntity customer);
    void update(UUID id, VehicleTypeEntity customer);
    void delete(UUID id);

    List<VehicleTypeEntity> findAll();
    List<VehicleTypeEntity> findById(UUID id);
    List<VehicleTypeEntity> findByFilter(VehicleTypeEntity customer);
}
