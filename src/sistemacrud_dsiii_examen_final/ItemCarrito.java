package sistemacrud_dsiii_examen_final;

public class ItemCarrito {
    private final Producto producto;
    private final int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return producto.getCosto() * cantidad;
    }

    @Override
    public String toString() {
        return producto.getNombre() + " x" + cantidad + " = $" + String.format("%.2f", getSubtotal());
    }
}

