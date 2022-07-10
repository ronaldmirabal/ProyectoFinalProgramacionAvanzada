package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.response.checkout;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto.CheckoutDTO;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutUpdateAddressResponse {
    private CheckoutDTO checkout;
}
