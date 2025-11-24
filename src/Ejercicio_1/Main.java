package Ejercicio_1;

public class Main {
    public static void main(String[] args) {

        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + f1.calcularArea());
        System.out.println("Área del rectángulo: " + f2.calcularArea());
    }
}
