package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.rules;

import java.util.UUID;

import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;

public final class CustomerNotFoundException extends UcoParkingException {

    private static final long serialVersionUID = 1L;

    private CustomerNotFoundException(String userMessage, String technicalMessage) {
        super(userMessage, technicalMessage, 404);
    }

    public static CustomerNotFoundException create(UUID customerId) {
        return new CustomerNotFoundException(
            "No se encontró un cliente con el identificador proporcionado.",
            "AddVehicle: customer not found with id=" + customerId
        );
    }
}