package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.product;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateProductRequest {
    private Long id;
    private String description;
    private long availableQuantity;
    private BigDecimal price;
}

