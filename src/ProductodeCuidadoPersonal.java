public class ProductodeCuidadoPersonal extends Producto{
    private String contenido;

    public ProductodeCuidadoPersonal(String nombre, double precio, String contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// Contenido: " + contenido + " /// Precio: $" + super.getPrecio();
    }
}
