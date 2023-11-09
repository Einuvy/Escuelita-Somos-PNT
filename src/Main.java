import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new ProductoBebible("Coca-Cola Zero", 20, 1.5));
        productos.add(new ProductoBebible("Coca-Cola", 18, 1.5));
        productos.add(new ProductodeCuidadoPersonal("Shampoo Sedal", 19, "500ml"));
        productos.add(new ProductoPorUnidad("Frutillas", 64, "kilo"));

        imprimirListaDeProductos(productos);
    }

    public static void imprimirProductos(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    private static void imprimirProductoMasCaro(List<Producto> productos) {
        Producto masCaro = Collections.max(productos);
        System.out.println("Producto más caro: " + masCaro.getNombre());
    }

    private static void imprimirProductoMasBarato(List<Producto> productos) {
        Producto masBarato = Collections.min(productos);
        System.out.println("Producto más barato: " + masBarato.getNombre());
    }

    private static void imprimirListaDeProductos(List<Producto> productos) {
       imprimirProductos(productos);
        System.out.println("=============================");
        imprimirProductoMasCaro(productos);
        imprimirProductoMasBarato(productos);
    }

}