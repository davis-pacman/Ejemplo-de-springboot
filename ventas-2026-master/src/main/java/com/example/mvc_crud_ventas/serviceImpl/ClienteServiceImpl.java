package com.example.mvc_crud_ventas.serviceImpl;

import com.example.mvc_crud_ventas.model.Cliente;
import com.example.mvc_crud_ventas.repository.ClienteRepository;
import com.example.mvc_crud_ventas.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> read(Long aLong) {
        return clienteRepository.findById(aLong);
    }

    @Override
    public void delete(Long aLong) {
        clienteRepository.deleteById(aLong);
    }

    @Override
    public List<Cliente> readAll() {
        return clienteRepository.findAll();
    }

}
