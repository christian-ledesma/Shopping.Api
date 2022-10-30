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
}
