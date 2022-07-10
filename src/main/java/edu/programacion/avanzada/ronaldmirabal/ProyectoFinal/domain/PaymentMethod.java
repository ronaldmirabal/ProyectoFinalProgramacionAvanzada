package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.domain;

import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto.PaymentMethodDTO;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.payment.UpdatePaymentMethodRequest;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "payment_methods")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    public PaymentMethodDTO toDTO() {
        return PaymentMethodDTO.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }

    public void applyChanges(UpdatePaymentMethodRequest updatePaymentMethodRequest) {
        description = updatePaymentMethodRequest.getDescription();
    }
}
