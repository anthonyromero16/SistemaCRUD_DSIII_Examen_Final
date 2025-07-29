package sistemacrud_dsiii_examen_final;

public class Producto {
    private int id;
    private String nombre;
    private double costo;
    private String descripcion;
    private String marca;
    private byte[] imagen;

    public Producto(int id, String nombre, double costo, String descripcion, String marca, byte[] imagen) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public byte[] getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return nombre + " - $" + String.format("%.2f", costo);
    }
}


