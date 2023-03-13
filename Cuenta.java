public class Cuenta {
    private String tipoCuenta;
    private double saldo;
    private double interesAnual;

    public Cuenta(String tipoCuenta, double saldo, double interesAnual) {
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

}
