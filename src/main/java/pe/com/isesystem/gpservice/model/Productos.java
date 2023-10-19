package pe.com.isesystem.gpservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "productos", schema = "esq_maestros")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Productos {

    @Id
    @Column(name="codi_prod")
    private String codiProd;

    @Column(name = "desc_prod")
    private String descProd;

    @Column(name = "codi_unid_medi")
    private String codiUnidMedi;

    @Column(name = "codi_mone")
    private String codiMone;

    @Column(name = "stock")
    private Double stock;

    @Column(name = "codi_clie_prov" )
    private String codiClieProv;

    @Column(name = "cod_pres")
    private Integer codPres;

    @Column(name = "prec_prov")
    private Double precProv;

    @Column(name = "descto_compra")
    private Double desctoCompra;

    @Column(name = "cod_impuesto")
    private Integer codImpuesto;

    @Column(name="tcambio")
    private Double tcambio;

    @Column(name = "nro_decim_precio")
    private Double nroDecimPrecio;

    @Column(name = "esta_acti")
    private String estaActi;
}
