package co.edu.uco.ucoparking.infrastructure.persistence.repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;

import java.util.List;
import java.util.UUID;

public interface VehicleRepository {
    void create(VehicleEntity customer);
    void update(UUID id, VehicleEntity customer);
    void delete(UUID id);

    List<VehicleEntity> findAll();
    List<VehicleEntity> findById(UUID id);
    List<VehicleEntity> findByFilter(VehicleEntity customer);
}
