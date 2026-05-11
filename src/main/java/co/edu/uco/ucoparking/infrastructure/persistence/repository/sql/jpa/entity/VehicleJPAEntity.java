package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "vehicle")
public class VehicleJPAEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "plate")
    private String plate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private CustomerJPAEntity customer;

    @ManyToOne
    @JoinColumn(name = "vehicle_type_id")
    private VehicleTypeJPAEntity vehicleType;

    public VehicleJPAEntity() {
        setId(UUID.fromString("00000000-0000-0000-0000-000000000000"));
        setPlate("");
        setCustomer(new CustomerJPAEntity());
        setVehicleType(new VehicleTypeJPAEntity());
    }

    public UUID getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public CustomerJPAEntity getCustomer() {
        return customer;
    }

    public VehicleTypeJPAEntity getVehicleType() {
        return vehicleType;
    }


    private void setVehicleType(VehicleTypeJPAEntity vehicleType) {
        this.vehicleType = vehicleType;
    }

    private void setCustomer(CustomerJPAEntity customer) {
        this.customer = customer;
    }

    private void setPlate(String plate) {
        this.plate = plate;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public VehicleJPAEntity(UUID id, CustomerJPAEntity customer, String plate, VehicleTypeJPAEntity vehicleType) {
        setId(id);
        setCustomer(customer);
        setPlate(plate);
        setVehicleType(vehicleType);
    }
}
