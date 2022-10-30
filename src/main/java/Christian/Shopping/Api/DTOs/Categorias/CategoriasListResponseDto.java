package Christian.Shopping.Api.DTOs.Categorias;

import Christian.Shopping.Api.Domain.Entities.Categorias;

import java.util.ArrayList;
import java.util.List;

public class CategoriasListResponseDto {
    private List<Categorias> Categorias;

    public CategoriasListResponseDto(List<Categorias> categorias) {
        Categorias = categorias;
    }

    public List<Categorias> getCategorias() {
        return Categorias;
    }

    public void setCategorias(List<Categorias> categorias) {
        Categorias = categorias;
    }
}
