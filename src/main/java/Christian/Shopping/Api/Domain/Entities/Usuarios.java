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

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido1, String apellido2, String email, String telefono, Integer paisId) {
        Nombre = nombre;
        Apellido1 = apellido1;
        Apellido2 = apellido2;
        Email = email;
        Telefono = telefono;
        PaisId = paisId;
    }

    public Usuarios(Integer usuarioId, String nombre, String apellido1, String apellido2, String email, String telefono, Integer paisId) {
        UsuarioId = usuarioId;
        Nombre = nombre;
        Apellido1 = apellido1;
        Apellido2 = apellido2;
        Email = email;
        Telefono = telefono;
        PaisId = paisId;
    }

    public Integer getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        UsuarioId = usuarioId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public Integer getPaisId() {
        return PaisId;
    }

    public void setPaisId(Integer paisId) {
        PaisId = paisId;
    }
}
