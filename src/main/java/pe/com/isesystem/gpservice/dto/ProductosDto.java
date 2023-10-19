package pe.com.isesystem.gpservice.dto;

import lombok.Data;

@Data
public class ProductosDto {

    private String codiProd;
    private String descProd;
    private String codiUnidMedi;
    private String codiMone;
    private Double stock;
    private String codiClieProv;
    private Integer codPres;
    private Double precProv;
    private Double desctoCompra;
    private Integer codImpuesto;
    private Double tcambio;
    private Double nroDecimPrecio;
    private String estaActi;
}
