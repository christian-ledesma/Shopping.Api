package Christian.Shopping.Api.DTOs.Usuarios;

public class UsuariosCreateRequestDto {
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Email;
    private String Telefono;
    private Integer PaisId;

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
