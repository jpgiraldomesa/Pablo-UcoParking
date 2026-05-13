package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.AddVehicleUseCase;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.rules.CustomerNotFoundException;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.rules.VehicleAlreadyExistsException;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.rules.VehicleTypeAlreadyAssignedException;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.rules.VehicleTypeNotFoundException;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.CustomerRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleTypeRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;

@Service
public class AddVehicleUseCaseImpl implements AddVehicleUseCase {

    private final CustomerRepository     customerRepository;
    private final VehicleRepository      vehicleRepository;
    private final VehicleTypeRepository  vehicleTypeRepository;

    public AddVehicleUseCaseImpl(CustomerRepository customerRepository,
                                 VehicleRepository vehicleRepository,
                                 VehicleTypeRepository vehicleTypeRepository) {
        this.customerRepository     = customerRepository;
        this.vehicleRepository      = vehicleRepository;
        this.vehicleTypeRepository  = vehicleTypeRepository;
    }

    @Override
    public Void execute(AddVehicleDomain data) {
        CustomerEntity owner = customerRepository.findById(data.getOwner());
        if (owner == null) {
            throw CustomerNotFoundException.create(data.getOwner());
        }

        VehicleTypeEntity vehicleType = vehicleTypeRepository.findById(data.getVehicleType());
        if (vehicleType == null) {
            throw VehicleTypeNotFoundException.create(data.getVehicleType());
        }

        VehicleEntity plateFilter = new VehicleEntity(null, data.getPlate(), null, null);
        if (!vehicleRepository.findByFilter(plateFilter).isEmpty()) {
            throw VehicleAlreadyExistsException.create(data.getPlate());
        }

        VehicleEntity ownerTypeFilter = new VehicleEntity(null, null, vehicleType, owner);
        if (!vehicleRepository.findByFilter(ownerTypeFilter).isEmpty()) {
            throw VehicleTypeAlreadyAssignedException.create(data.getOwner(), data.getVehicleType());
        }

        vehicleRepository.create(new VehicleEntity(data.getId(), data.getPlate(), vehicleType, owner));

        return null;
    }
}
