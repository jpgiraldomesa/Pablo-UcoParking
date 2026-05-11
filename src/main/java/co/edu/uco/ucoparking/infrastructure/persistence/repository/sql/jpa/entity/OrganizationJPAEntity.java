package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "organization")
public class OrganizationJPAEntity {

    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "name")
    private String name;

    public OrganizationJPAEntity() {
        setId(UUID.fromString("00000000-0000-0000-0000-000000000000"));
        setName("");
    }

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

    public OrganizationJPAEntity(UUID id, String name) {
        super();
        setId(id);
        setName(name);
    }
}
