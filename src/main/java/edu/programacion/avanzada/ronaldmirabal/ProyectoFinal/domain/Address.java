package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.domain;

import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto.AddressDTO;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.address.UpdateAddressRequest;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    public AddressDTO toDTO() {
        return AddressDTO.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }

    public void applyChanges(UpdateAddressRequest updateAddressRequest) {
        description = updateAddressRequest.getDescription();
    }

}
