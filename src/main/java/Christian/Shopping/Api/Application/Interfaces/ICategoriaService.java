package Christian.Shopping.Api.Application.Interfaces;

import Christian.Shopping.Api.DTOs.Categorias.CategoriasGetResponseDto;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasListResponseDto;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasCreateRequestDto;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasCreateResponseDto;
import org.springframework.stereotype.Component;

@Component
public interface ICategoriaService {
    CategoriasCreateResponseDto Add(CategoriasCreateRequestDto request);
    CategoriasListResponseDto FindAll();
    CategoriasGetResponseDto FindById(Integer id);
}
