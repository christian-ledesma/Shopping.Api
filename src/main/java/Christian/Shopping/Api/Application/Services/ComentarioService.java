package Christian.Shopping.Api.Application.Services;

import Christian.Shopping.Api.Application.Interfaces.IComentarioService;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosCreateRequestDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosCreateResponseDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosListResponseDto;
import Christian.Shopping.Api.Domain.Entities.Comentarios;
import Christian.Shopping.Api.Infrastructure.Repositories.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComentarioService implements IComentarioService {
    private final ComentarioRepository comentarioRepository;

    @Autowired
    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    public ComentariosCreateResponseDto Add(ComentariosCreateRequestDto request) {
        var comentario = new Comentarios(request.getComentario(), request.getUsuarioId(), request.getProductoId());
        var _comentario = comentarioRepository.save(comentario);
        return new ComentariosCreateResponseDto(
                _comentario.getComentarioId(), _comentario.getComentario(),
                _comentario.getProductoId(), _comentario.getUsuarioId());
    }

    public ComentariosListResponseDto FindByUsuario(Integer id) {
        var comentarios = comentarioRepository.findByUsuarioId(id).get();
        return new ComentariosListResponseDto(comentarios);
    }

    public ComentariosListResponseDto FindByProducto(Integer id) {
        var comentarios = comentarioRepository.findByProductoId(id).get();
        return new ComentariosListResponseDto(comentarios);
    }
}
