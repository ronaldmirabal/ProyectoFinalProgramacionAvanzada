package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.repositories;

import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.domain.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}