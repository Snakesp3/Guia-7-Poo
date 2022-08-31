/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejerciciosaprendizajeguia6;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una frase o palabra");
        String frase=leer.nextLine();
        Boolean a=false;
        String frase2="eureka";
        a= frase.equalsIgnoreCase(frase2);
        System.out.println("es igual???"+a);        
                
    }
    
}
