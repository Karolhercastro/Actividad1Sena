public class CuentaDeInversion extends Cuenta {
    private int numeroCuentaIn;
    private double montoInicial;
    private double saldoMinimoIn;

    public CuentaDeInversion(String tipoCuenta, double saldo, double interesAnual) {
        super(tipoCuenta, saldo, interesAnual);
        this.numeroCuentaIn = numeroCuentaIn;
        this.montoInicial = montoInicial;
        this.saldoMinimoIn= saldoMinimoIn;
    }
}
