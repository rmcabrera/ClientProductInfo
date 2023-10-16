package pe.com.isesystem.gpservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.isesystem.gpservice.model.ClienteProveedor;

import java.util.List;

@Repository
public interface ClienteProveedorRepository extends JpaRepository<ClienteProveedor, String> {
    ClienteProveedor findByCodiClieProv(String codigo);

    Page<ClienteProveedor> findAllByEstaActi(boolean activo, Pageable pageable);



}
