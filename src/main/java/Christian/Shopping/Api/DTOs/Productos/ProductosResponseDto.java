package Christian.Shopping.Api.DTOs.Productos;

public class ProductosResponseDto {
    private Integer ProductoId;
    private String Nombre;
    private float Precio;
    private Integer CategoriaId;
    private boolean EnStock;
    private boolean EsDestacado;
    private String Descripcion;
    private String Imagen;

    public ProductosResponseDto(Integer productoId, String nombre, float precio, Integer categoriaId, boolean enStock, boolean esDestacado, String descripcion, String imagen) {
        ProductoId = productoId;
        Nombre = nombre;
        Precio = precio;
        CategoriaId = categoriaId;
        EnStock = enStock;
        EsDestacado = esDestacado;
        Descripcion = descripcion;
        Imagen = imagen;
    }

    public Integer getProductoId() {
        return ProductoId;
    }

    public void setProductoId(Integer productoId) {
        ProductoId = productoId;
    }

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
