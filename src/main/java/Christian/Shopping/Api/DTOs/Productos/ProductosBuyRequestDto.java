package Christian.Shopping.Api.DTOs.Productos;

public class ProductosBuyRequestDto {
    private int ProductoId;
    private int UsuarioId;

    public int getProductoId() {
        return ProductoId;
    }

    public void setProductoId(int productoId) {
        ProductoId = productoId;
    }

    public int getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        UsuarioId = usuarioId;
    }
}
