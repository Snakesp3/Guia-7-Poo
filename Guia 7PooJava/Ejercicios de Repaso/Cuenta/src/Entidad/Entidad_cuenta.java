
package Entidad;

/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mÃ­nimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, nÃºmero de cuenta e interÃ©s.
b) Agregar los mÃ©todos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiÃ©ndole los datos al usuario.
d) MÃ©todo ingresar(double ingreso): el mÃ©todo recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) MÃ©todo retirar(double retiro): el mÃ©todo recibe una cantidad de dinero a retirar y se la
restarÃ¡ al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrÃ¡ el
saldo actual en 0.
f) MÃ©todo extraccionRapida(): le permitirÃ¡ sacar solo un 20% de su saldo. Validar que el
usuario no saque mÃ¡s del 20%.
g) MÃ©todo consultarSaldo(): permitirÃ¡ consultar el saldo disponible en la cuenta.
h) MÃ©todo consultarDatos(): permitirÃ¡ mostrar todos los datos de la cuenta*/
public class Entidad_cuenta {
  
     
    public int numeroCuenta;
    public long dni;
    public double saldoActual;
    public int ingresarDinero;
    
    public Entidad_cuenta() {
    }

    public Entidad_cuenta(int numeroCuenta, long dni, double saldoActual, int ingresarDinero) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.ingresarDinero = ingresarDinero;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getingresarDinero(){
        return ingresarDinero;
    }
    
    public void setingresarDinero(int ingresarDinero){
        this.ingresarDinero = ingresarDinero;
    }
    
    
    
    
    
    
    
    
    
}
