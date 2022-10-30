package Christian.Shopping.Api.Infrastructure.Repositories;

import Christian.Shopping.Api.Domain.Entities.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentarios, Integer> {
    @Query("FROM Comentarios WHERE usuario_id = ?1")
    Optional<List<Comentarios>> findByUsuarioId(Integer usuario_id);
    @Query("FROM Comentarios WHERE producto_id = ?1")
    Optional<List<Comentarios>> findByProductoId(Integer producto_id);
}
