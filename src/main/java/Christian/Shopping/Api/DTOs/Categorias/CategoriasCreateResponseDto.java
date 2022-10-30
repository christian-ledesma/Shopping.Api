package Christian.Shopping.Api.DTOs.Categorias;

public class CategoriasCreateResponseDto {
    private Integer CategoriaId;
    private String Nombre;

    public CategoriasCreateResponseDto(Integer categoriaId, String nombre) {
        CategoriaId = categoriaId;
        Nombre = nombre;
    }

    public Integer getCategoriaId() {
        return CategoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        CategoriaId = categoriaId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
