package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.payment;
import lombok.*;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdatePaymentMethodRequest {
    private Long id;
    private String description;
    private long availableQuantity;
    private BigDecimal price;
}
