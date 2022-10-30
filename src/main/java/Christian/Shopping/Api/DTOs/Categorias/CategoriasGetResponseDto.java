package Christian.Shopping.Api.DTOs.Categorias;

import Christian.Shopping.Api.Domain.Entities.Categorias;

public class CategoriasGetResponseDto {
    private Categorias Categoria;

    public CategoriasGetResponseDto(Categorias categoria) {
        Categoria = categoria;
    }

    public Categorias getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categorias categoria) {
        Categoria = categoria;
    }
}
