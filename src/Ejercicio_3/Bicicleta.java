package Ejercicio_3;    

public class Bicicleta extends Transporte {

    @Override
    public void mover() {
        System.out.println("La bicicleta avanza pedaleando...");
    }

    @Override
    public int obtenerVelocidadMaxima() {
        return 25; // km/h
    }
}
