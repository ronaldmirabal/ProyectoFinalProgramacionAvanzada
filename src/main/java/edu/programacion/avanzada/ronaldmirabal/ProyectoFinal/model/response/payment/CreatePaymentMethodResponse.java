package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.response.payment;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto.PaymentMethodDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentMethodResponse {
    private PaymentMethodDTO paymentMethod;
}
