package co.edu.uco.ucoparking.infrastructure.persistence.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

public class OrganizationEntity {

    private UUID id;
    private String name;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public OrganizationEntity(UUID id, String name) {
        super();
        setId(id);
        setName(name);
    }
}
