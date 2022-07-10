package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.response.adress;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateAddressResponse {
    private AddressDTO address;
}
