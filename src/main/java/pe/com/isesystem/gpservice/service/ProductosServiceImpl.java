package pe.com.isesystem.gpservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.com.isesystem.gpservice.dto.ProductosDto;
import pe.com.isesystem.gpservice.model.Productos;
import pe.com.isesystem.gpservice.repository.ClienteProveedorRepository;
import pe.com.isesystem.gpservice.repository.ProductosRepository;

import java.util.List;

@Service
public class ProductosServiceImpl implements ProductosService{

    @Autowired
    private ProductosRepository productosRepository;

    @Override
    public Productos getById(String codigo) {
        return productosRepository.findByCodiProd(codigo);
    }

    @Override
    public Page<Productos> obtenerProductosPaginados(Pageable pageable) {
        return productosRepository.findAll(pageable);
    }

    @Override
    public List<Productos> obtenerTodos() {
        return productosRepository.findAllByEstaActi("1");
    }
}
