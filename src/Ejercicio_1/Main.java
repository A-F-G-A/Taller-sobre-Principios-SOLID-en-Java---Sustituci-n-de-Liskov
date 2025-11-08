package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien Años de seriedad", "Gabriel Garcia Marquez");

        BasedeDatos basedeDatos = new BasedeDatos();
        basedeDatos.guardarLibro(libro);

        Reporte reporte = new Reporte();
        reporte.generarReporte(libro);
    }
}
