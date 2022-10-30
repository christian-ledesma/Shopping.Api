package Christian.Shopping.Api.DTOs.Productos;

public class ProductosCreateRequestDto {
    private String Nombre;
    private float Precio;
    private Integer CategoriaId;
    private boolean EnStock;
    private boolean EsDestacado;
    private String Descripcion;
    private String Imagen;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public Integer getCategoriaId() {
        return CategoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        CategoriaId = categoriaId;
    }

    public boolean isEnStock() {
        return EnStock;
    }

    public void setEnStock(boolean enStock) {
        EnStock = enStock;
    }

    public boolean isEsDestacado() {
        return EsDestacado;
    }

    public void setEsDestacado(boolean esDestacado) {
        EsDestacado = esDestacado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }
}
