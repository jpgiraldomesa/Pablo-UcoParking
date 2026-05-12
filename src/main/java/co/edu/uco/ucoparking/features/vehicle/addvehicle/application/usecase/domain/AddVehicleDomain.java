package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain;

import java.util.UUID;

public final class AddVehicleDomain {

    private final UUID   id;
    private final String plate;
    private final UUID   vehicleType;
    private final UUID   owner;

    public AddVehicleDomain(String plate, UUID vehicleType, UUID owner) {
        this.id          = UUID.randomUUID();
        this.plate       = plate;
        this.vehicleType = vehicleType;
        this.owner       = owner;
    }

    public UUID   getId()          { return id; }
    public String getPlate()       { return plate; }
    public UUID   getVehicleType() { return vehicleType; }
    public UUID   getOwner()       { return owner; }
}