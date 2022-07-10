package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.payment;

import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.domain.PaymentMethod;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentMethodRequest {
    private String name;
    private String description;

    public PaymentMethod toPaymentMethod() {
        return PaymentMethod.builder()
                .name(name)
                .description(description)
                .build();
    }
}
