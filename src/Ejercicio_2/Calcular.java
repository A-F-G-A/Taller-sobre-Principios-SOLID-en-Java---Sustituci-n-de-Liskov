package Ejercicio_2;

public class Calcular {
    public double aplicarDescuento(Producto producto, double porcentajeDescuento){
        return producto.getPrecio() - (producto.getPrecio() * porcentajeDescuento / 100);
    }
}
