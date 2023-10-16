package pe.com.isesystem.gpservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.isesystem.gpservice.model.ClienteProveedor;

@Repository
public interface ClienteProveedorRepository extends JpaRepository<ClienteProveedor, String> {
    ClienteProveedor findByCodiClieProv(String codigo);
}
