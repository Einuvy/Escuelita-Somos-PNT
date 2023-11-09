public class ProductoBebible extends Producto {

    private double litros;

    public ProductoBebible(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// Litros: " + litros + " /// Precio: $" + super.getPrecio();
    }
}
