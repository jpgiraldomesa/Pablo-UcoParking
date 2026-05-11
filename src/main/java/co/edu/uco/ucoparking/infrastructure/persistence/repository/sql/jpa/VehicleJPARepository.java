package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.VehicleJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VehicleJPARepository extends JpaRepository<VehicleJPAEntity, UUID> {
}
