package sistemacrud_dsiii_examen_final;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private static final List<ItemCarrito> items = new ArrayList<>();

    public static void agregar(ItemCarrito item) {
        items.add(item);
    }

    public static void quitar(ItemCarrito item) {
        items.remove(item);
    }

    public static List<ItemCarrito> getItems() {
        return items;
    }

    public static double calcularTotal() {
        return items.stream().mapToDouble(ItemCarrito::getSubtotal).sum();
    }

    public static void limpiar() {
        items.clear();
    }
    
    public static int contarCantidadTotal() {
    return items.stream().mapToInt(ItemCarrito::getCantidad).sum();
    }
}

