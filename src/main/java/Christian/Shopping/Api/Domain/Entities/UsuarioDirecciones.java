package Christian.Shopping.Api.Domain.Entities;

import javax.persistence.*;

@Entity
@Table
public class UsuarioDirecciones {
    @Id
    @SequenceGenerator(name = "usuariodireccion_sequence", sequenceName = "usuariodireccion_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuariodireccion_sequence")
    private Integer UsuarioDireccionId;
    private Integer UsuarioId;
    private String Direccion;
    private Boolean EsPrincipal;
}
