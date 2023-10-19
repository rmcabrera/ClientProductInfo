package pe.com.isesystem.gpservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.isesystem.gpservice.dto.ProductosDto;
import pe.com.isesystem.gpservice.model.ClienteProveedor;
import pe.com.isesystem.gpservice.model.Productos;

import java.util.List;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, String> {

    Productos findByCodiProd(String codigo);
    Page<Productos> findAll(Pageable pageable);

    List<Productos> findAllByEstaActi(String estado);

}
