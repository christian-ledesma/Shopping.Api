package Christian.Shopping.Api.Controllers;

import Christian.Shopping.Api.Application.Interfaces.ICategoriaService;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasGetResponseDto;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasListResponseDto;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasCreateRequestDto;
import Christian.Shopping.Api.DTOs.Categorias.CategoriasCreateResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/categorias")
public class CategoriasController {
    private final ICategoriaService categoriasService;

    @Autowired
    public CategoriasController(ICategoriaService categoriasService) {
        this.categoriasService = categoriasService;
    }

    @GetMapping(path = "list")
    public CategoriasListResponseDto FindAll() {
        return categoriasService.FindAll();
    }

    @GetMapping(path = "{id}")
    public CategoriasGetResponseDto FindById(@PathVariable Integer id) {
        return categoriasService.FindById(id);
    }

    @PostMapping
    public CategoriasCreateResponseDto Add(@RequestBody CategoriasCreateRequestDto request) {
        return categoriasService.Add(request);
    }
}
