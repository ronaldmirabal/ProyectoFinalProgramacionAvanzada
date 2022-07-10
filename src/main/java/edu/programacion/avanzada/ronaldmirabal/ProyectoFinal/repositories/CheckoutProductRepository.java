package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.repositories;

import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.domain.CheckoutProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutProductRepository extends JpaRepository<CheckoutProduct, Long> {
}
