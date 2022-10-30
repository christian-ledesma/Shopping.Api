package Christian.Shopping.Domain.Entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Paises {
    @Id
    @GeneratedValue
    private Long PaisId;
    @NotNull
    private String Nombre;
    @NotNull
    private String Capital;
}
