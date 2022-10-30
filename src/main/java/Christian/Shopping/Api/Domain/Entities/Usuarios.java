package Christian.Shopping.Api.Domain.Entities;

import javax.persistence.*;

@Entity
@Table
public class Usuarios {
    @Id
    @SequenceGenerator(name = "usuario_sequence", sequenceName = "usuario_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_sequence")
    private Integer UsuarioId;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Email;
    private String Telefono;
    private Integer PaisId;
}
