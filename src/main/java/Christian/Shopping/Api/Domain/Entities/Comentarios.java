package Christian.Shopping.Api.Domain.Entities;

import javax.persistence.*;

@Entity
@Table
public class Comentarios {
    @Id
    @SequenceGenerator(name = "comentario_sequence", sequenceName = "comentario_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comentario_sequence")
    private Integer ComentarioId;
    private String Comentario;
    private Integer UsuarioId;
    private Integer ProductoId;

    public Comentarios() {
    }

    public Comentarios(String comentario, Integer usuarioId, Integer productoId) {
        Comentario = comentario;
        UsuarioId = usuarioId;
        ProductoId = productoId;
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

    public Integer getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        UsuarioId = usuarioId;
    }

    public Integer getProductoId() {
        return ProductoId;
    }

    public void setProductoId(Integer productoId) {
        ProductoId = productoId;
    }
}
