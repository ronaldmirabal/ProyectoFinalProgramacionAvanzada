package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PaymentMethodDTO {
    private Long id;
    private String name;
    private String description;
}
