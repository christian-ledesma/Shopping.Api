package Christian.Shopping.Api.Controllers;

import Christian.Shopping.Api.Application.Interfaces.IProductoService;
import Christian.Shopping.Api.DTOs.Productos.ProductosCreateRequestDto;
import Christian.Shopping.Api.DTOs.Productos.ProductosEditRequestDto;
import Christian.Shopping.Api.DTOs.Productos.ProductosListResponseDto;
import Christian.Shopping.Api.DTOs.Productos.ProductosResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/productos")
public class ProductosController {
    private final IProductoService productoService;

    @Autowired
    public ProductosController(IProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public ProductosListResponseDto FindAll() {
        return productoService.FindAll();
    }

    @PostMapping()
    public ProductosResponseDto Add(@RequestBody ProductosCreateRequestDto request) {
        return productoService.Add(request);
    }

    @DeleteMapping(path = "{id}")
    public void Delete(@PathVariable Integer id) {
        productoService.Delete(id);
    }

    @PutMapping
    public ProductosResponseDto Edit(@RequestBody ProductosEditRequestDto request) {
        return productoService.Edit(request);
    }
}
