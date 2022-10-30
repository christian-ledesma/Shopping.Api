package Christian.Shopping.Api.Infrastructure.Repositories;

import Christian.Shopping.Api.Domain.Entities.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categorias, Integer> {
}
