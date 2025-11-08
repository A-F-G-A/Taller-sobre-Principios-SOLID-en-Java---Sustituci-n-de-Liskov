package Ejercicio_1;

public class BasedeDatos{
    public void guardarLibro(Libro libro){
        System.out.println("Guardando libro: " + libro.getTitulo() + " de " + libro.getAutor());
    }
}