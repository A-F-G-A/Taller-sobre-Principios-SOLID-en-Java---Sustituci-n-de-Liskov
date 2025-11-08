package OCP.Ejercicio_1;

public class MainOCP {
    public static void main(String[] args) {
        double precioOriginal = 200.0;

        Descuento descuentoPorcentaje = new DescuentoPorcentaje(10); // 10% de descuento
        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento por porcentaje: $" + precioConDescuentoPorcentaje);

        Descuento descuentoFijo = new DescuentoFijo(30); // $30 de descuento
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento fijo: $" + precioConDescuentoFijo);
    }
}