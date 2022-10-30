package Christian.Shopping.Api.Infrastructure.Repositories;

import Christian.Shopping.Api.Domain.Entities.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer> {
}
