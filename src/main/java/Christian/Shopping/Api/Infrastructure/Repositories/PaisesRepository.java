package Christian.Shopping.Api.Infrastructure.Repositories;

import Christian.Shopping.Api.Domain.Entities.Paises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisesRepository extends JpaRepository<Paises, Integer> {
}
