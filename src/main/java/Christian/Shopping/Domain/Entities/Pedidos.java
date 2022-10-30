package Christian.Shopping.Domain.Entities;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Pedidos {
    @Id
    @GeneratedValue
    private Integer PedidoId;
    @NotNull
    private Integer UsuarioId;
    @NotNull
    private Integer ProductoId;
}
