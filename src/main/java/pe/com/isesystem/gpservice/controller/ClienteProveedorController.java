package pe.com.isesystem.gpservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.com.isesystem.gpservice.dto.PaginationRequestDto;
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

    @GetMapping("/todos")
    public Page<ClienteProveedor> obtenerTodosLosClientes(
            @RequestBody PaginationRequestDto paginationRequestDTO) {

        Sort.Direction sortDirection = Sort.Direction.ASC;
        if ("desc".equalsIgnoreCase(paginationRequestDTO.getDirection())) {
            sortDirection = Sort.Direction.DESC;
        }

        Sort sortable = Sort.by(sortDirection, paginationRequestDTO.getSort());
        Pageable pageable = PageRequest.of(
                paginationRequestDTO.getPage(),
                paginationRequestDTO.getSize(),
                sortable
        );

        return clienteProveedorService.obtenerClientesPaginados(pageable);
    }

}
