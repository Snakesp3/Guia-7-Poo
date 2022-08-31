
package javaguia6;

import java.util.Scanner;

public class EjeE3 {

   
    public static void main(String[] args) {
       
        /*EjeE 3)Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
          Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra;        
        letra=leer.nextLine();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u")){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
