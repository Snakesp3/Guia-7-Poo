
package Servicio;

import Entidad.Entidad_cuenta;
import java.util.Scanner;

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
public class Servicio_cuenta {
  
    
    Scanner leer = new Scanner(System.in);
    Entidad_cuenta c1 = new Entidad_cuenta();

    //Metodo Crear objeto
    public Entidad_cuenta objeto(){
       
        System.out.println("***Ingresar Numero de Cuenta***");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("-----------");

        System.out.println("***Ingresar DNI***");
        c1.setDni(leer.nextLong());
        System.out.println("------------");
       return c1; 
    }
    //Metodo saldo Actual
    public double saldoActual() {
        c1.setSaldoActual(100);
        return c1.getSaldoActual();


//        int saldoActual = 100;
//        return saldoActual;
    }
    //Metodo Ingresar Dinero
     public void ingresarDinero(){
        System.out.println("***Ingrese dinero a su cuenta***");
        c1.setingresarDinero(leer.nextInt());
         System.out.println("Su saldo anteriro es: "+"$"+c1.getSaldoActual());
         c1.setSaldoActual(c1.getingresarDinero()+c1.getSaldoActual());
         System.out.println("Su nuevo saldo actualizado es: " +"$"+c1.saldoActual);
         System.out.println("---------------------------");
    }
    //Metodo retirar Dinero 
     public void retirarDinero(){
        System.out.println("***Cuanto dinero quiere retirar***");
        c1.setingresarDinero(leer.nextInt());
         System.out.println("Su saldo anteriro es: "+"$"+c1.getSaldoActual());
         c1.setSaldoActual(c1.getSaldoActual()-c1.getingresarDinero());
         System.out.println("Su nuevo saldo actualizado es: " +"$"+c1.saldoActual);
         System.out.println("---------------------------");
    }
    // Metodo MÃ©todo extraccionRapida
    //MÃ©todo extraccionRapida(): le permitirÃ¡ sacar solo un 20% de su saldo. Validar que el
    //usuario no saque mÃ¡s del 20%.
    public void extraccionRapida() {

        System.out.println("Mi saldo actual es-> " +"$"+ c1.getSaldoActual());

        if (c1.getSaldoActual() > 0) {


            double aux;
            aux = c1.getSaldoActual() * 0.20;

            System.out.println("La extracciÃ³n rapida solo permite retirar el 20% de su saldo actual");
            System.out.println("Lo Max que puede retirar es--> " + "$"+aux);
            System.out.println("---------------------------");

            System.out.println("***Desea continua con la operacion? S/N***");
            String carac = leer.next();
            carac = carac.toLowerCase();
            System.out.println("Gracias por venir, que tenga un excelente dia");
            if (carac.equalsIgnoreCase("s")) {
                

                c1.setSaldoActual(c1.getSaldoActual() - aux);
                System.out.println("saldo actualizado es-> " +"$"+ c1.getSaldoActual());
            }
        } else {

            System.out.println("Saldo insuficiente");
        }
    }
//MÃ©todo consultarSaldo(): permitirÃ¡ consultar el saldo disponible en la cuenta.
    
    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: " + c1.getSaldoActual());


    }
    
    
    
    
    
    
    
    
}
