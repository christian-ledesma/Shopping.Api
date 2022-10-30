package Christian.Shopping.Api.DTOs.Productos;

import Christian.Shopping.Api.Domain.Entities.Productos;

import java.util.List;

public class ProductosListResponseDto {
    private List<Productos> Productos;

    public ProductosListResponseDto(List<Productos> productos) {
        Productos = productos;
    }

    public List<Productos> getProductos() {
        return Productos;
    }

    public void setProductos(List<Productos> productos) {
        Productos = productos;
    }
}
