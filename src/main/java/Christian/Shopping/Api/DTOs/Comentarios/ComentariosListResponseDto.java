package Christian.Shopping.Api.DTOs.Comentarios;

import Christian.Shopping.Api.Domain.Entities.Comentarios;

import java.util.List;

public class ComentariosListResponseDto {
    List<Comentarios> Comentarios;

    public ComentariosListResponseDto(List<Christian.Shopping.Api.Domain.Entities.Comentarios> comentarios) {
        Comentarios = comentarios;
    }

    public List<Christian.Shopping.Api.Domain.Entities.Comentarios> getComentarios() {
        return Comentarios;
    }

    public void setComentarios(List<Christian.Shopping.Api.Domain.Entities.Comentarios> comentarios) {
        Comentarios = comentarios;
    }
}
