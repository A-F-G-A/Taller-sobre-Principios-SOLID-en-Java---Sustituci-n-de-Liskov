package Ejercicio_2;

public class CuentaAhorros extends CuentaBancaria {

    private double interesMensual;

    public CuentaAhorros(double saldoInicial, double interesMensual) {
        super(saldoInicial);
        this.interesMensual = interesMensual;
    }

    public void aplicarInteres() {
        saldo += saldo * interesMensual;
    }
}
