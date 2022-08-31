
package Main_Class;

import Entidad.Repasoeje22;
import java.util.Scanner;


public class Repa2 {

    
    public static void main(String[] args) {
     
       Scanner leer = new Scanner(System.in);
        
       Repasoeje22 circunferencia = new Repasoeje22();
        
       circunferencia.CrearCircunferencia1();
        
        System.out.println("El radio de la circunferencia es: " +circunferencia.area(circunferencia.getRadio()));
        System.out.println("El perimetro de la circunferencia es: " +circunferencia.perimetro(circunferencia.getRadio()));
        
    }
    
}
