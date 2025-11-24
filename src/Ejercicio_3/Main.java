package Ejercicio_3;

public class Main{
    public static void main(String[] args) {

        Transporte t1 = new Bicicleta();
        Transporte t2 = new Coche();

        t1.mover();
        t2.mover();

        System.out.println("Velocidad bicicleta: " + t1.obtenerVelocidadMaxima());
        System.out.println("Velocidad coche: " + t2.obtenerVelocidadMaxima());
    }
}
