package co.edu.uco.ucoparking.infrastructure.persistence.repository.entity;

import java.util.UUID;

public class CustomerEntity {

    private UUID id;

    private String name;
    private String lastname;
    private String email;
    private String phonenumber;
    private String idNumber;
    private IdTypeEntity idType;
    private OrganizationEntity organization;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public IdTypeEntity getIdType() {
        return idType;
    }

    public OrganizationEntity getOrganization() {
        return organization;
    }


    private void setId(UUID id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    private void setIdType(IdTypeEntity idType) {
        this.idType = idType;
    }

    private void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    private void setOrganization(OrganizationEntity organization) {
        this.organization = organization;
    }

    public CustomerEntity(UUID id, String name, String lastname, String email, String phonenumber, String idNumber, IdTypeEntity idType, OrganizationEntity organization) {
        setId(id);
        setName(name);
        setLastname(lastname);
        setEmail(email);
        setPhonenumber(phonenumber);
        setIdNumber(idNumber);
        setIdType(idType);
        setOrganization(organization);
    }
}
