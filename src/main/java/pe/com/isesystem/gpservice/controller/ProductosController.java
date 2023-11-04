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
import pe.com.isesystem.gpservice.dto.ProductosDto;
import pe.com.isesystem.gpservice.model.Productos;
import pe.com.isesystem.gpservice.service.ProductosService;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {
    @Autowired
    private ProductosService productosService;

    @GetMapping("/{codigo}")
    public ResponseEntity<Productos> obtenerProducto(@PathVariable String codigo) {
        Productos productosDto = productosService.getById(codigo);
        if (productosDto != null) {
            return new ResponseEntity<>(productosDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Productos>> obtenerAllProductos() {
        List<Productos> productosDtos = productosService.obtenerTodos();
        if (productosDtos != null) {
            return new ResponseEntity<>(productosDtos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/todosPaginado")
    public Page<Productos> obtenerTodosLosProductos(
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

        return productosService.obtenerProductosPaginados(pageable);
    }
}
