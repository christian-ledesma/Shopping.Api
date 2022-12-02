package Christian.Shopping.Api.Domain.Entities;

import javax.persistence.*;

@Entity
@Table
public class Pedidos {
    @Id
    @SequenceGenerator(name = "pedido_sequence", sequenceName = "pedido_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_sequence")
    private Integer PedidoId;
    private Integer UsuarioId;
    private Integer ProductoId;

    public Pedidos(Integer usuarioId, Integer productoId) {
        UsuarioId = usuarioId;
        ProductoId = productoId;
    }

    public Integer getPedidoId() {
        return PedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        PedidoId = pedidoId;
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
