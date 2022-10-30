package Christian.Shopping.Domain.Entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Categorias {
    @Id
    @GeneratedValue
    private Integer CategoriaId;
    @NotNull
    private String Nombre;
}
