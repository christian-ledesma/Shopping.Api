package Christian.Shopping.Api.Controllers;

import Christian.Shopping.Api.Application.Interfaces.IProductoService;
import Christian.Shopping.Api.DTOs.Productos.*;
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

    @GetMapping(path = "{id}")
    public ProductosResponseDto FindById(@PathVariable Integer id) {
        return productoService.FindById(id);
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
    public ProductosResponseDto Edit(@RequestBody ProductosUpdateRequestDto request) {
        return productoService.Edit(request);
    }

    @PostMapping(path = "buy")
    public void Buy(@RequestBody ProductosBuyRequestDto request) {
        productoService.Buy(request);
    }
}
