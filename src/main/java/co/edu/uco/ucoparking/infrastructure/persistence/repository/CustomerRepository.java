package co.edu.uco.ucoparking.infrastructure.persistence.repository;


import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;

import java.util.List;
import java.util.UUID;

public interface CustomerRepository {
    void create(CustomerEntity customer);
    void update(UUID id, CustomerEntity customer);
    void delete(UUID id);

    List<CustomerEntity> findAll();
    List<CustomerEntity> findById(UUID id);
    List<CustomerEntity> findByFilter(CustomerEntity customer);
}
