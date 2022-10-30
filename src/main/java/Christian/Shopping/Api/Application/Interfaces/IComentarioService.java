package Christian.Shopping.Api.Application.Interfaces;

import Christian.Shopping.Api.DTOs.Comentarios.ComentariosCreateRequestDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosCreateResponseDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosListResponseDto;
import org.springframework.stereotype.Component;

@Component
public interface IComentarioService {
    ComentariosCreateResponseDto Add(ComentariosCreateRequestDto request);
    ComentariosListResponseDto FindByUsuario(Integer id);
    ComentariosListResponseDto FindByProducto(Integer id);
}
