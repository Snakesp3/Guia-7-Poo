
package Main;

import Entidad.Entidad_cuenta;
import Servicio.Servicio_cuenta;
import java.util.Scanner;


public class Main_cuenta {
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
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        Servicio_cuenta p1 = new Servicio_cuenta();
        Entidad_cuenta c1 = p1.objeto();
        p1.saldoActual();
        
         
        System.out.println("Su Numero de Cuenta es: "+"NÂº" +c1.getNumeroCuenta());
        System.out.println("Su Numero del D.N.I es: "+"NÂº" +c1.getDni());
        System.out.println("Su Saldo Actual es: "+"$" +c1.getSaldoActual());
        p1.ingresarDinero();
        p1.retirarDinero();
        p1.extraccionRapida();
        
        System.out.println("-------------------------------------");
        System.out.println("***Elija una opciones del 1 al 2***");
        System.out.println("***Datos de la cuenta***");
        System.out.println("***Saldo Actual***");
        int opciones = leer.nextInt();
        
        
        switch (opciones){
            case 1:  
                    System.out.println("Los datos de la cuenta son: "+"\nEl numero de la cuenta es: "+"NÂº"+c1.getNumeroCuenta()+"\nEl numero de DNI es: "+"NÂº"+c1.getDni());
                    break;
            case 2:  
                    System.out.println("Su saldo actual es: " +"$"+c1.getSaldoActual());
                    break;
            default:
                    System.out.println("Elija una de las opciones");
                    
    
    
    
    
    
    
    
}

        





        
    }
        
        
        
        
        
        
        
        
        
    }
    

