package Christian.Shopping.Api.Infrastructure.Repositories;

import Christian.Shopping.Api.Domain.Entities.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedidos, Integer> {
}
