package Christian.Shopping.Api.Domain.Entities;

import javax.persistence.*;

@Entity
@Table
public class Productos {
    @Id
    @SequenceGenerator(name = "producto_sequence", sequenceName = "producto_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_sequence")
    private Integer ProductoId;
    private String Nombre;
    private float Precio;
    private Integer CategoriaId;
    private boolean Stock;
    private String Descripcion;
    private String Imagen;
}
