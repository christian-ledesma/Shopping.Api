package Christian.Shopping.Api.Domain.Entities;

import javax.persistence.*;

@Entity
@Table
public class Paises {
    @Id
    @SequenceGenerator(name = "pais_sequence", sequenceName = "pais_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pais_sequence")
    private Long PaisId;
    private String Nombre;
    private String Capital;

    public Paises() {
    }

    public Long getPaisId() {
        return PaisId;
    }

    public void setPaisId(Long paisId) {
        PaisId = paisId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }
}
