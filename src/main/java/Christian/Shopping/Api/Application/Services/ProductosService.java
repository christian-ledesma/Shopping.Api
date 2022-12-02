package Christian.Shopping.Api.Application.Services;

import Christian.Shopping.Api.Application.Interfaces.IProductoService;
import Christian.Shopping.Api.DTOs.Productos.*;
import Christian.Shopping.Api.Domain.Entities.Pedidos;
import Christian.Shopping.Api.Domain.Entities.Productos;
import Christian.Shopping.Api.Infrastructure.Repositories.PedidoRepository;
import Christian.Shopping.Api.Infrastructure.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductosService implements IProductoService {
    private final ProductoRepository productoRepository;
    private final PedidoRepository pedidoRepository;

    @Autowired
    public ProductosService(ProductoRepository productoRepository, PedidoRepository pedidoRepository) {
        this.productoRepository = productoRepository;
        this.pedidoRepository = pedidoRepository;
    }

    public ProductosResponseDto Add(ProductosCreateRequestDto request) {
        var _producto = new Productos(
                request.getNombre(),
                request.getPrecio(),
                request.getCategoriaId(),
                request.isDisponible(),
                request.isEsDestacado(),
                request.getDescripcion(),
                request.getImagen());
        productoRepository.save(_producto);
        return new ProductosResponseDto(
                _producto.getProductoId(),
                _producto.getNombre(),
                _producto.getPrecio(),
                _producto.getCategoriaId(),
                _producto.isDisponible(),
                _producto.isEsDestacado(),
                _producto.getDescripcion(),
                _producto.getImagen());
    }

    public void Delete(Integer id) {
        productoRepository.deleteById(id);
    }

    public ProductosResponseDto Edit(ProductosUpdateRequestDto request) {
        var _producto = new Productos(
                request.getProductoId(),
                request.getNombre(),
                request.getPrecio(),
                request.getCategoriaId(),
                request.isDisponible(),
                request.isEsDestacado(),
                request.getDescripcion(),
                request.getImagen());
        productoRepository.save(_producto);
        return new ProductosResponseDto(
                _producto.getProductoId(),
                _producto.getNombre(),
                _producto.getPrecio(),
                _producto.getCategoriaId(),
                _producto.isDisponible(),
                _producto.isEsDestacado(),
                _producto.getDescripcion(),
                _producto.getImagen());
    }

    public ProductosListResponseDto FindAll() {
        var productos = productoRepository.findAll();
        return new ProductosListResponseDto(productos);
    }

    public ProductosResponseDto FindById(Integer id) {
        var producto = productoRepository.findById(id).get();
        return new ProductosResponseDto(producto.getProductoId(),
                producto.getNombre(),
                producto.getPrecio(),
                producto.getCategoriaId(),
                producto.isDisponible(),
                producto.isEsDestacado(),
                producto.getDescripcion(),
                producto.getImagen());
    }

    public void Buy(ProductosBuyRequestDto request) {
        var pedido = new Pedidos(request.getUsuarioId(), request.getProductoId());
        var producto = productoRepository.findById(request.getProductoId()).get();

        producto.setDisponible(false);

        productoRepository.save(producto);
        pedidoRepository.save(pedido);
    }
}
