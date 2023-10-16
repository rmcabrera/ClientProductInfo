package pe.com.isesystem.gpservice.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.com.isesystem.gpservice.model.ClienteProveedor;

public interface ClienteProveedorService {

    ClienteProveedor getById(String codigo);

    Page<ClienteProveedor> obtenerClientesPaginados(Pageable pageable);

}
