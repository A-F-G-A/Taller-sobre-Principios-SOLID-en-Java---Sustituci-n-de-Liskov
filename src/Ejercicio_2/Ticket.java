package Ejercicio_2;

public class Ticket {
    public void generarTicket(Producto producto){
        System.out.println("Producto: " + producto.nombre);
        System.out.println("Precio: $" + producto.precio);
    }
}
