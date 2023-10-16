package pe.com.isesystem.gpservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.isesystem.gpservice.model.ClienteProveedor;

import java.util.List;

@Repository
public interface ClienteProveedorRepository extends JpaRepository<ClienteProveedor, String> {
    ClienteProveedor findByCodiClieProv(String codigo);

    Page<ClienteProveedor> findAll(Pageable pageable);


    @Query(value = "select  codi_clie_prov, razo_soci, denominacion, ruc, direccion, tipo_pers, esta_acti " +
            "from esq_maestros.cliente_proveedor where rownum<=10000 ", nativeQuery = true)
    List<ClienteProveedor> encontrarTodos();

}
