package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.repositories;

import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
}