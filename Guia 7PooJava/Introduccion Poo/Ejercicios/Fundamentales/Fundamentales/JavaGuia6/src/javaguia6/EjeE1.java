
package javaguia6;

import java.util.Scanner;


public class EjeE1 {

   
    public static void main(String[] args) {
       
        
        //Dias=24hs
        //Horas=60min        
        //Minutos=60seg
        
     /*1)Dado un tiempo en minutos, calcular su equivalente en dÃ­as y horas. Por ejemplo, si el 
       usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 dÃ­a, 2 horas.*/
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un tiempo en minutos para luego mostrar el equivalente en dias y horas");
        int dias,horas,minutos;
        
        minutos=leer.nextInt();
        
        dias=minutos/1440;
        minutos=minutos%1440/60;
        horas=minutos%60;           
      
        System.out.println(+dias+ " dias " +horas+ " horas "+minutos+ " Minutos ");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
