package Christian.Shopping.Api.Application.Services;

import Christian.Shopping.Api.Application.Interfaces.IPaisService;
import Christian.Shopping.Api.DTOs.Paises.PaisesListResponseDto;
import Christian.Shopping.Api.Infrastructure.Repositories.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaisService implements IPaisService {
    private final PaisRepository paisesRepository;

    @Autowired
    public PaisService(PaisRepository paisesRepository) {
        this.paisesRepository = paisesRepository;
    }

    public PaisesListResponseDto FindAll() {
        var paises = paisesRepository.findAll();
        return new PaisesListResponseDto(paises);
    }
}
