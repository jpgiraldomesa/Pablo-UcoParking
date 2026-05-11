package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.CustomerRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper.CustomerEntityMapper;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.CustomerJPARepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.CustomerJPAEntity;

import java.util.List;
import java.util.UUID;

public class CustomerJPARepositoryAdapter implements CustomerRepository {

    private final CustomerJPARepository repository;

    public CustomerJPARepositoryAdapter(CustomerJPARepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(CustomerEntity customer) {
        CustomerJPAEntity customerJPAEntity = CustomerEntityMapper.toJPA(customer);
        repository.save(customerJPAEntity);
    }

    @Override
    public void update(UUID id, CustomerEntity customer) {
        CustomerJPAEntity customerJPAEntity = CustomerEntityMapper.toJPA(customer);
        repository.save(customerJPAEntity); // JPA hace upsert por ID
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public List<CustomerEntity> findAll() {
        return repository.findAll()
                .stream()
                .map(CustomerEntityMapper::toDomain)
                .toList();
    }

    @Override
    public List<CustomerEntity> findById(UUID id) {
        return repository.findById(id)
                .stream()
                .map(CustomerEntityMapper::toDomain)
                .toList();
    }

    @Override
    public List<CustomerEntity> findByFilter(CustomerEntity customer) {
        return List.of();
    }
}
