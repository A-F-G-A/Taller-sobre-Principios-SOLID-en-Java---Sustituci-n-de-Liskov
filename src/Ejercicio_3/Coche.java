package Ejercicio_3;    

public class Coche extends Transporte {

    @Override
    public void mover() {
        System.out.println("El coche avanza con motor...");
    }

    @Override
    public int obtenerVelocidadMaxima() {
        return 180; // km/h
    }
}
