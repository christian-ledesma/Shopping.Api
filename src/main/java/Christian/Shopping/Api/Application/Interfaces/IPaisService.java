package Christian.Shopping.Api.Application.Interfaces;

import Christian.Shopping.Api.DTOs.Paises.PaisesListResponseDto;
import org.springframework.stereotype.Component;

@Component
public interface IPaisService {
    PaisesListResponseDto FindAll();
}
