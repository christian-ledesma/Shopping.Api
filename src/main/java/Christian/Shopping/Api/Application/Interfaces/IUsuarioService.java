package Christian.Shopping.Api.Application.Interfaces;

import Christian.Shopping.Api.DTOs.Usuarios.*;
import org.springframework.stereotype.Component;

@Component
public interface IUsuarioService {
    UsuariosResponseDto Add(UsuariosCreateRequestDto request);
    UsuariosResponseDto Edit(UsuariosEditRequestDto request);
    UsuariosLoginResponseDto Login(UsuariosLoginRequestDto request);
}
