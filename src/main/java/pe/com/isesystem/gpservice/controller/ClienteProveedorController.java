package pe.com.isesystem.gpservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.isesystem.gpservice.model.ClienteProveedor;
import pe.com.isesystem.gpservice.service.ClienteProveedorService;

@RestController
@RequestMapping("/clienteProveedor")
public class ClienteProveedorController {
    @Autowired
    private ClienteProveedorService clienteProveedorService;

    @GetMapping("/{codigo}")
    public ResponseEntity<ClienteProveedor> obtenerClienteProveedor(@PathVariable String codigo) {
        ClienteProveedor cliente = clienteProveedorService.getById(codigo);
        if (cliente != null) {
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
