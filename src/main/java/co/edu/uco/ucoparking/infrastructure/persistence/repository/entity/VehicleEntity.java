package co.edu.uco.ucoparking.infrastructure.persistence.repository.entity;

import java.util.UUID;

public class VehicleEntity {

    private UUID id;

    private String plate;

    private CustomerEntity customer;

    private VehicleTypeEntity vehicleType;

    public UUID getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public VehicleTypeEntity getVehicleType() {
        return vehicleType;
    }


    private void setVehicleType(VehicleTypeEntity vehicleType) {
        this.vehicleType = vehicleType;
    }

    private void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    private void setPlate(String plate) {
        this.plate = plate;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public VehicleEntity(UUID id, String plate, CustomerEntity customer, VehicleTypeEntity vehicleType) {
        setId(id);
        setPlate(plate);
        setCustomer(customer);
        setVehicleType(vehicleType);
    }
}
