public class CuentaDeAhorros extends Cuenta{
    private int numeroCuenta;
    private double depositoInicial;
    private double saldoMinimo;


    public CuentaDeAhorros(String tipoCuenta, double saldo, double interesAnual) {
        super(tipoCuenta, saldo, interesAnual);
        this.numeroCuenta = numeroCuenta;
        this.depositoInicial = depositoInicial;
        this.saldoMinimo= saldoMinimo;
    }
}
