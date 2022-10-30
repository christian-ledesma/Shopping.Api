package Christian.Shopping.Domain.Entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Usuarios {
    @Id
    @GeneratedValue
    private Integer UsuarioId;
    @NotNull
    private String Nombre;
    @NotNull
    private String Apellido1;
    private String Apellido2;
    @NotNull
    private String Email;
    private String Telefono;
    private Integer PaisId;
}
