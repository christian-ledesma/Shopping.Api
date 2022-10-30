package Christian.Shopping.Api.Application.Services;

import Christian.Shopping.Api.Application.Interfaces.ICategoriaService;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasGetResponseDto;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasListResponseDto;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasCreateRequestDto;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasCreateResponseDto;
import Christian.Shopping.Api.Domain.Entities.Categorias;
import Christian.Shopping.Api.Infrastructure.Repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoriaService implements ICategoriaService {
    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public CategoriasCreateResponseDto Add(CategoriasCreateRequestDto request) {
        var categoria = new Categorias(request.getNombre());
        var _categoria = categoriaRepository.save(categoria);
        return new CategoriasCreateResponseDto(_categoria.getCategoriaId(), _categoria.getNombre());
    }

    public CategoriasListResponseDto FindAll() {
        var categorias = categoriaRepository.findAll();
        return new CategoriasListResponseDto(categorias);
    }

    public CategoriasGetResponseDto FindById(Integer id) {
        var categoria = categoriaRepository.findById(id).get();
        return new CategoriasGetResponseDto(categoria);
    }
}
