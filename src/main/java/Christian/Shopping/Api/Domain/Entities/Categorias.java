package Christian.Shopping.Api.Domain.Entities;

import javax.persistence.*;

@Entity
@Table
public class Categorias {
    @Id
    @SequenceGenerator(name = "categoria_sequence", sequenceName = "categoria_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_sequence")
    private Integer CategoriaId;
    private String Nombre;

    public Categorias() {
    }

    public Categorias(String nombre) {
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
