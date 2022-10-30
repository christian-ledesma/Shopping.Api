package Christian.Shopping.Domain.Entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Comentarios {
    @Id
    @GeneratedValue
    private Integer ComentarioId;
    @NotNull
    private String Comentario;
    private Integer UsuarioId;
    private Integer ProductoId;
}
