package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.impl;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.mapper.AddVehicleDomainMapper;
import co.edu.uco.ucoparking.features.vehicule.addvehicle.application.usecase.AddVehicleUseCase;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.CustomerRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleTypeRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddVehicleUseCaseImpl implements AddVehicleUseCase {

	private final CustomerRepository customerRepository;
	private final VehicleRepository vehicleRepository;
	private final VehicleTypeRepository vehicleTypeRepository;

	public AddVehicleUseCaseImpl(CustomerRepository customerRepository,
	                             VehicleRepository vehicleRepository,
	                             VehicleTypeRepository vehicleTypeRepository) {
		this.customerRepository = customerRepository;
		this.vehicleRepository = vehicleRepository;
		this.vehicleTypeRepository = vehicleTypeRepository;
	}

	@Override
	public Void execute(AddVehicleDomain data) {

		List<CustomerEntity> customers = customerRepository.findById(data.getOwner());
		CustomerEntity customer = customers.get(0);
		List<VehicleTypeEntity> vehicleTypes = vehicleTypeRepository.findById(data.getVehicleType());
		VehicleTypeEntity vehicleType = vehicleTypes.get(0);

		VehicleEntity vehicleEntity = AddVehicleDomainMapper.toEntity(data, customer, vehicleType);

		vehicleRepository.create(vehicleEntity);

		return null;
	}
}