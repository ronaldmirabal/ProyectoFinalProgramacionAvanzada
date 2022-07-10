package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.checkout;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutUpdateAddressRequest {
    private UUID id;

    private Long address;
}
