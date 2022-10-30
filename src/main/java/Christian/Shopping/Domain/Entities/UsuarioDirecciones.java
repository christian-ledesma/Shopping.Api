package Christian.Shopping.Domain.Entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UsuarioDirecciones {
    @Id
    @GeneratedValue
    private Integer UsuarioDireccionId;
    @NotNull
    private Integer UsuarioId;
    @NotNull
    private String Direccion;
    @NotNull
    private Boolean EsPrincipal;
}
