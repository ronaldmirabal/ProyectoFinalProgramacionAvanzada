package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.product;

import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetProductRequest {
    private List<ProductDTO> products;
}
