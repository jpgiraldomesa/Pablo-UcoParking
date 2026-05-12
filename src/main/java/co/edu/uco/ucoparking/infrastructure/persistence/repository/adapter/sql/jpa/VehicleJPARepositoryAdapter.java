package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper.VehicleEntityMapper;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.VehicleJPARepository;

@Repository
public class VehicleJPARepositoryAdapter implements VehicleRepository {

    private final VehicleJPARepository repository;
    private final VehicleEntityMapper mapper;

    public VehicleJPARepositoryAdapter(VehicleJPARepository repository, VehicleEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void create(VehicleEntity entity) {
        repository.save(mapper.toJPA(entity));
    }

    @Override
    public void update(UUID id, VehicleEntity entity) {
        // TODO
    }

    @Override
    public void delete(UUID id) {
        // TODO
    }

    @Override
    public List<VehicleEntity> findAll() {
        return repository.findAll()
            .stream()
            .map(mapper::toEntity)
            .toList();
    }

    @Override
    public List<VehicleEntity> findByFilter(VehicleEntity filter) {
        // TODO
        return List.of();
    }

    @Override
    public VehicleEntity findById(UUID id) {
        return repository.findById(id)
            .map(mapper::toEntity)
            .orElse(null);
    }
}
