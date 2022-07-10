package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.address;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.domain.Address;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateAddressRequest {
    private String name;
    private String description;

    public Address toPaymentMethod() {
        return Address.builder()
                .name(name)
                .description(description)
                .build();
    }
}
