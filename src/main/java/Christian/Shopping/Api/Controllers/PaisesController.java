package Christian.Shopping.Api.Controllers;

import Christian.Shopping.Api.Application.Interfaces.IPaisService;
import Christian.Shopping.Api.DTOs.Paises.PaisesListResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/paises")
public class PaisesController {
    private final IPaisService paisService;

    public PaisesController(IPaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping
    public PaisesListResponseDto FindAll() {
        return paisService.FindAll();
    }
}
