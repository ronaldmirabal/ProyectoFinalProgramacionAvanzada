package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.payment;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeletePaymentMethodRequest {
    private Long id;
}
