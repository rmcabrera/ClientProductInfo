package pe.com.isesystem.gpservice.dto;


import lombok.Data;

@Data
public class ClienteProveedorDto {

    private String codiClieProv;
    private String razoSoci;
    private String denominacion;
    private String ruc;
    private String direccion;
    private String tipoPers;
    private boolean estaActi;

}
