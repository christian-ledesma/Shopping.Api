package Christian.Shopping.Api.Controllers;

import Christian.Shopping.Api.Application.Interfaces.IComentarioService;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosCreateRequestDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosResponseDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosListResponseDto;
import Christian.Shopping.Api.DTOs.Comentarios.ComentariosUpdateRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/comentarios")
public class ComentariosController {
    private final IComentarioService comentarioService;

    @Autowired
    public ComentariosController(IComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    @PostMapping
    public ComentariosResponseDto Add(@RequestBody ComentariosCreateRequestDto request) {
        return comentarioService.Add(request);
    }

    @PutMapping
    public ComentariosResponseDto Update(@RequestBody ComentariosUpdateRequestDto request) {
        return comentarioService.Update(request);
    }

    @GetMapping(path = "findByUsuario/{id}")
    public ComentariosListResponseDto FindByUsuario(@PathVariable Integer id) {
        return comentarioService.FindByUsuario(id);
    }

    @GetMapping(path = "findByProducto/{id}")
    public ComentariosListResponseDto FindByProducto(@PathVariable Integer id) {
        return comentarioService.FindByProducto(id);
    }
}
