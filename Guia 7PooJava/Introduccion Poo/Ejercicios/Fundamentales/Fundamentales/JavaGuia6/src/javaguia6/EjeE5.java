
package javaguia6;

import java.util.Scanner;


public class EjeE5 {

    
    public static void main(String[] args) {
      
        /*EjeE 5)Una obra social tiene tres clases de socios:
          * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
          todos los tipos de tratamientos.
          * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
          los mismos tratamientos que los socios del tipo A.
          * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
          tratamientos.
          * Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
          real que represente el costo del tratamiento (previo al descuento) y determine el
          importe en efectivo a pagar por dicho socio.*/
        
        
        Scanner leer = new Scanner(System.in);
        
        String letra;
        double montoT;
        
        System.out.println("Ingrese el monto del tratamiento");
        montoT=leer.nextDouble();
        
        System.out.println("Ingresar que tipo de socio es A,B,C");
        letra=leer.next();
        
        switch(letra.toUpperCase()){
            
            case "A":
                System.out.println(montoT/2);
                System.out.println("Tiene un descuento del 50% su total a abonar es de: $ " +montoT);
                break;
            case "B":
                System.out.println("Su monto a pagar con descuento es: $" +montoT*0.65);
                System.out.println("Tiene un descuento del 35% su total a abonar es de: $ " +montoT);    
                break;
            case "C":
                System.out.println(montoT);
                System.out.println("No reciben descuentos sobre dichos tratamientos");    
                break; 
                
            default:
                System.out.println("Ingrese una de las opciones A,B,C");
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
    }
    
}
