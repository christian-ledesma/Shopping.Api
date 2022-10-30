package Christian.Shopping.Api.Application.Services;

import Christian.Shopping.Api.Application.Interfaces.IProductoService;
import Christian.Shopping.Api.DTOs.Productos.ProductosCreateRequestDto;
import Christian.Shopping.Api.DTOs.Productos.ProductosEditRequestDto;
import Christian.Shopping.Api.DTOs.Productos.ProductosListResponseDto;
import Christian.Shopping.Api.DTOs.Productos.ProductosResponseDto;
import Christian.Shopping.Api.Domain.Entities.Productos;
import Christian.Shopping.Api.Infrastructure.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductosService implements IProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductosService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public ProductosResponseDto Add(ProductosCreateRequestDto request) {
        var _producto = new Productos(
                request.getNombre(),
                request.getPrecio(),
                request.getCategoriaId(),
                request.isEnStock(),
                request.isEsDestacado(),
                request.getDescripcion(),
                request.getImagen());
        productoRepository.save(_producto);
        return new ProductosResponseDto(
                _producto.getProductoId(),
                _producto.getNombre(),
                _producto.getPrecio(),
                _producto.getCategoriaId(),
                _producto.isEnStock(),
                _producto.isEsDestacado(),
                _producto.getDescripcion(),
                _producto.getImagen());
    }

    public void Delete(Integer id) {
        productoRepository.deleteById(id);
    }

    public ProductosResponseDto Edit(ProductosEditRequestDto request) {
        var _producto = new Productos(
                request.getProductoId(),
                request.getNombre(),
                request.getPrecio(),
                request.getCategoriaId(),
                request.isEnStock(),
                request.isEsDestacado(),
                request.getDescripcion(),
                request.getImagen());
        productoRepository.save(_producto);
        return new ProductosResponseDto(
                _producto.getProductoId(),
                _producto.getNombre(),
                _producto.getPrecio(),
                _producto.getCategoriaId(),
                _producto.isEnStock(),
                _producto.isEsDestacado(),
                _producto.getDescripcion(),
                _producto.getImagen());
    }

    public ProductosListResponseDto FindAll() {
        var productos = productoRepository.findAll();
        return new ProductosListResponseDto(productos);
    }
}
