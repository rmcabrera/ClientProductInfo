package pe.com.isesystem.gpservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.isesystem.gpservice.model.ClienteProveedor;
import pe.com.isesystem.gpservice.repository.ClienteProveedorRepository;

@Service
public class ClienteProveedorServiceImpl implements ClienteProveedorService {

    @Autowired
    private ClienteProveedorRepository clienteProveedorRepository;

    @Override
    public ClienteProveedor getById(String codigo) {
        return clienteProveedorRepository.findByCodiClieProv(codigo);
    }

}
