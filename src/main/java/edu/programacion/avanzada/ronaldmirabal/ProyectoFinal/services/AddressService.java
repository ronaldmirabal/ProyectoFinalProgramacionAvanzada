package edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.services;

import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.domain.Address;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.dto.AddressDTO;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.address.CreateAddressRequest;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.address.DeleteAddressRequest;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.model.request.address.UpdateAddressRequest;
import edu.programacion.avanzada.ronaldmirabal.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;

    public List<AddressDTO> getAll() {
        return addressRepository.findAll().stream().map(Address::toDTO).collect(Collectors.toList());
    }

    public AddressDTO get(Long id) {
        return addressRepository.findById(id).orElseThrow().toDTO();
    }

    public AddressDTO create(CreateAddressRequest createAddressRequest) {
        Address address = addressRepository.save(createAddressRequest.toPaymentMethod());
        return address.toDTO();
    }

    public AddressDTO update(UpdateAddressRequest updateAddressRequest) {
        Address address = addressRepository.findById(updateAddressRequest.getId()).orElseThrow();
        address.applyChanges(updateAddressRequest);
        addressRepository.save(address);
        return address.toDTO();
    }

    public void delete(DeleteAddressRequest deleteAddressRequest) {
        addressRepository.deleteById(deleteAddressRequest.getId());
    }
}