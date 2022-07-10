package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.response.adress;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetAddressResponse {
    private List<AddressDTO> addresses;
}
