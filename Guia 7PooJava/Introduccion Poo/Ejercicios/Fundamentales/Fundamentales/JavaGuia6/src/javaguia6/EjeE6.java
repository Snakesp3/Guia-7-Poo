
package javaguia6;

import java.util.Scanner;

public class EjeE6 {

   
    public static void main(String[] args) {
      
        
        /*ejeE 6)Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
                 debajo de 1.60 mts. y el promedio de estaturas en general.*/
        
        Scanner leer = new Scanner(System.in);
        float alturaP;
        System.out.println("Ingresa una altura");
        alturaP=leer.nextFloat();
        
        if(alturaP>=1.60){
            System.out.println("Usted tiene la estatura igual o mayor al promedio");
        }else{
            System.out.println("Estas por debajo del promedio");
        }
        
        
        
        
        
        
        
        
    }
    
}
