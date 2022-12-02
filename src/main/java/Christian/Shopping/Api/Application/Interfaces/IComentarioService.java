package Christian.Shopping.Api.Application.Interfaces;

import Christian.Shopping.Api.DTOs.Comentarios.ComentariosCreateRequestDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosResponseDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosListResponseDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosUpdateRequestDto;
import org.springframework.stereotype.Component;

@Component
public interface IComentarioService {
    ComentariosResponseDto Add(ComentariosCreateRequestDto request);
    ComentariosResponseDto Update(ComentariosUpdateRequestDto request);
    ComentariosListResponseDto FindByUsuario(Integer id);
    ComentariosListResponseDto FindByProducto(Integer id);
}
