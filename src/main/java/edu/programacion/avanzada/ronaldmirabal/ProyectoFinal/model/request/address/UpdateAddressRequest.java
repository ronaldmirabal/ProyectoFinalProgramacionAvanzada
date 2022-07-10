package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.address;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateAddressRequest {
    private Long id;
    private String description;

}
