package pe.com.isesystem.gpservice.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.com.isesystem.gpservice.dto.ProductosDto;
import pe.com.isesystem.gpservice.model.ClienteProveedor;
import pe.com.isesystem.gpservice.model.Productos;

import java.util.List;

public interface ProductosService {

    Productos getById(String codigo);

    Page<Productos> obtenerProductosPaginados(Pageable pageable);

    List<Productos> obtenerTodos();
}
