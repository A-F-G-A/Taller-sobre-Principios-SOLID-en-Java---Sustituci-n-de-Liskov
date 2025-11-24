package Ejercicio_2;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria(1000);
        CuentaBancaria c2 = new CuentaAhorros(1000, 0.02);

        c1.retirar(200);
        c2.retirar(200); // funciona igual que en CuentaBancaria

        System.out.println("Saldo cuenta normal: " + c1.getSaldo());
        System.out.println("Saldo cuenta ahorros: " + c2.getSaldo());
    }
}
