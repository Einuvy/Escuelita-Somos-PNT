public class ProductoPorUnidad extends Producto{

    private String unidad;

    public ProductoPorUnidad(String name, double price, String unidad) {
        super(name, price);
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return super.toString() + " /// Unidad de venta: " + unidad;
    }
}
