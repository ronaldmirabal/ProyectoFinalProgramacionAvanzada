package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.repositories;

import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
