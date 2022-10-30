package Christian.Shopping.Domain.Entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Productos {
    @Id
    @GeneratedValue
    private Integer ProductoId;
    @NotNull
    private String Nombre;
    @NotNull
    private float Precio;
    private Integer CategoriaId;
    @NotNull
    private boolean Stock;
    private String Descripcion;
    private String Imagen;
}
