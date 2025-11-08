package OCP.LSP;

public class Mainfigura {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.area());

        Figura rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.area());
    }
}