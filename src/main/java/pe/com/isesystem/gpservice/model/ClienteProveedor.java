package pe.com.isesystem.gpservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente_proveedor", schema = "esq_maestros")
@Entity
public class ClienteProveedor {

    @Id
    @Column(name = "codi_clie_prov")
    private String codiClieProv;

    @Column(name ="razo_soci")
    private String razoSoci;

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name = "ruc")
    private String ruc;

    @Column(name = "direccion")
    private String direccion;

    @Column (name = "tipo_pers")
    private String tipoPers;

    @Nullable
    @Column(name="esta_acti")
    private boolean estaActi=true;

}
