
package Main_persona2;

import Servicio.Servicio_Persona2;
import java.util.Scanner;


public class Main_persona2 {

    
    public static void main(String[] args) {
       
          Scanner leer = new Scanner(System.in);
        Servicio_Persona2 s1 = new Servicio_Persona2();
        
        s1.crearPersona();
        
        System.out.println("la edad de la persona ingresa es "+s1.calcularEdad());
        
        System.out.println("ingrese una edad");
        int edad = leer.nextInt();
        System.out.println("la edad ingresada es mayor que la del receptor "+s1.menorQue(edad));
        
        s1.mostrarPersona();
    }  
       
}
    

