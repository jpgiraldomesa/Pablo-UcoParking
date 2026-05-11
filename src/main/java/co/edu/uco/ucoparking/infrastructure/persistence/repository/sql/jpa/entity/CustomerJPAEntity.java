    package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity;

    import jakarta.persistence.*;

    import java.util.UUID;

    @Entity
    @Table(name = "client")
    public class CustomerJPAEntity {

        @Id
        @Column(name = "id")
        private UUID id;
        @Column(name ="first_name")
        private String name;
        @Column(name ="last_name")
        private String lastname;
        @Column(name ="email")
        private String email;
        @Column(name ="phone")
        private String phonenumber;
        @Column(name ="document_number")
        private String idNumber;
        @ManyToOne
        @JoinColumn(name = "id_type")
        private IdTypeJPAEntity idType;
        @ManyToOne
        @JoinColumn(name = "organization")
        private OrganizationJPAEntity organization;

        public CustomerJPAEntity() {
            setId(UUID.fromString("00000000-0000-0000-0000-000000000000"));
            setEmail("");
            setPhonenumber("");
            setIdNumber("");
            setName("");
            setLastname("");
            setOrganization(new OrganizationJPAEntity());
            setIdType(new IdTypeJPAEntity());
        }

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

        public IdTypeJPAEntity getIdType() {
            return idType;
        }

        public OrganizationJPAEntity getOrganization() {
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

        private void setIdType(IdTypeJPAEntity idType) {
            this.idType = idType;
        }

        private void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        private void setOrganization(OrganizationJPAEntity organization) {
            this.organization = organization;
        }

        public CustomerJPAEntity(UUID id, String name, String lastname, String email, String phonenumber, String idNumber, IdTypeJPAEntity idType, OrganizationJPAEntity organization) {
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
