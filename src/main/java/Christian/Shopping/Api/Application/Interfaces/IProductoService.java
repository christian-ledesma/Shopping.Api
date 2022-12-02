package Christian.Shopping.Api.Application.Interfaces;

import Christian.Shopping.Api.DTOs.Productos.*;
import org.springframework.stereotype.Component;

@Component
public interface IProductoService {
    ProductosResponseDto Add(ProductosCreateRequestDto request);
    void Delete(Integer id);
    ProductosResponseDto Edit(ProductosUpdateRequestDto request);
    ProductosListResponseDto FindAll();
    ProductosResponseDto FindById(Integer id);
    void Buy(ProductosBuyRequestDto request);
}
