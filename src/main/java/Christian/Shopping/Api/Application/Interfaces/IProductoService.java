package Christian.Shopping.Api.Application.Interfaces;

import Christian.Shopping.Api.DTOs.Productos.ProductosCreateRequestDto;
import Christian.Shopping.Api.DTOs.Productos.ProductosEditRequestDto;
import Christian.Shopping.Api.DTOs.Productos.ProductosResponseDto;
import Christian.Shopping.Api.DTOs.Productos.ProductosListResponseDto;
import org.springframework.stereotype.Component;

@Component
public interface IProductoService {
    ProductosResponseDto Add(ProductosCreateRequestDto request);
    void Delete(Integer id);
    ProductosResponseDto Edit(ProductosEditRequestDto request);
    ProductosListResponseDto FindAll();
}
