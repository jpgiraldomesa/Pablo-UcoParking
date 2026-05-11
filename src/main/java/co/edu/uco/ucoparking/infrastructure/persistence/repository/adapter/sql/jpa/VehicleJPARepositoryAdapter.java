package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper.VehicleEntityMapper;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.VehicleJPARepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.VehicleJPAEntity;

import java.util.List;
import java.util.UUID;

public class VehicleJPARepositoryAdapter implements VehicleRepository {

    private final VehicleJPARepository repository;

    public VehicleJPARepositoryAdapter(VehicleJPARepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(VehicleEntity vehicle) {
        VehicleJPAEntity vehicleJPAEntity = VehicleEntityMapper.toJPA(vehicle);
        repository.save(vehicleJPAEntity);
    }

    @Override
    public void update(UUID id, VehicleEntity vehicle) {
        VehicleJPAEntity vehicleJPAEntity = VehicleEntityMapper.toJPA(vehicle);
        repository.save(vehicleJPAEntity);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public List<VehicleEntity> findAll() {
        return repository.findAll()
                .stream()
                .map(VehicleEntityMapper::toDomain)
                .toList();
    }

    @Override
    public List<VehicleEntity> findById(UUID id) {
        return repository.findById(id)
                .stream()
                .map(VehicleEntityMapper::toDomain)
                .toList();
    }

    @Override
    public List<VehicleEntity> findByFilter(VehicleEntity vehicle) {
        return List.of();
    }
}