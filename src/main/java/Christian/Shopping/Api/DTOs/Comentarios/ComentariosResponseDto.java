package Christian.Shopping.Api.DTOs.Comentarios;

public class ComentariosResponseDto {
    private Integer ComentarioId;
    private String Comentario;
    private Integer ProductoId;
    private Integer UsuarioId;

    public ComentariosResponseDto(Integer comentarioId, String comentario, Integer productoId, Integer usuarioId) {
        ComentarioId = comentarioId;
        Comentario = comentario;
        ProductoId = productoId;
        UsuarioId = usuarioId;
    }

    public Integer getComentarioId() {
        return ComentarioId;
    }

    public void setComentarioId(Integer comentarioId) {
        ComentarioId = comentarioId;
    }

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
