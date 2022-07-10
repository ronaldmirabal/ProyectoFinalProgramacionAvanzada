package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.response.product;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateProductResponse {
    private ProductDTO product;
}
