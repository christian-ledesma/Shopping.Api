package Christian.Shopping.Api.DTOs.Paises;

import Christian.Shopping.Api.Domain.Entities.Paises;

import java.util.List;

public class PaisesListResponseDto {
    private List<Paises> Paises;

    public PaisesListResponseDto(List<Christian.Shopping.Api.Domain.Entities.Paises> paises) {
        Paises = paises;
    }

    public List<Christian.Shopping.Api.Domain.Entities.Paises> getPaises() {
        return Paises;
    }

    public void setPaises(List<Christian.Shopping.Api.Domain.Entities.Paises> paises) {
        Paises = paises;
    }
}
