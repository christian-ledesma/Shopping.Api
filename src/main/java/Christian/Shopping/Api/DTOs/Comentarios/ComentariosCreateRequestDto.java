package Christian.Shopping.Api.DTOs.Comentarios;

public class ComentariosCreateRequestDto {
    private String Comentario;
    private Integer ProductoId;
    private Integer UsuarioId;

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public Integer getProductoId() {
        return ProductoId;
    }

    public void setProductoId(Integer productoId) {
        ProductoId = productoId;
    }

    public Integer getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        UsuarioId = usuarioId;
    }
}
