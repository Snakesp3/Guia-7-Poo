
package Entidad;


public class Clase_Cuenta {
    
      private int numeroCuenta;
    private int DNI;
    private int saldoActual;

    public Clase_Cuenta() {
    }

    public Clase_Cuenta(int numeroCuenta, int DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta" + "\n"
                + "numeroCuenta=" + numeroCuenta + "\n"
                + "DNI=" + DNI + "\n"
                + "saldoActual=" + saldoActual;
    }
    
    
    
    
    
    
}
