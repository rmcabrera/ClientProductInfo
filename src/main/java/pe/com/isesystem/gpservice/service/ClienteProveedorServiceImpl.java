package pe.com.isesystem.gpservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.com.isesystem.gpservice.model.ClienteProveedor;
import pe.com.isesystem.gpservice.repository.ClienteProveedorRepository;

import java.util.List;

@Service
public class ClienteProveedorServiceImpl implements ClienteProveedorService {

    @Autowired
    private ClienteProveedorRepository clienteProveedorRepository;

    @Override
    public ClienteProveedor getById(String codigo) {
        return clienteProveedorRepository.findByCodiClieProv(codigo);
    }

    @Override
    public Page<ClienteProveedor> obtenerClientesPaginados(Pageable pageable) {
        return clienteProveedorRepository.findAll(pageable);
    }

    @Override
    public List<ClienteProveedor> obtenerTodos() {

        return clienteProveedorRepository.encontrarTodos();
    }

}
