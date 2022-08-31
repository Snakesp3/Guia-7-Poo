/*
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejerciciosaprendizajeguia6;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        double num=leer.nextInt();
        
        System.out.println("El doble es: " +2*num+ " el triple es: " +3*num+ "y la raiz cuadrada es " + Math.sqrt(num));
    }
    
}

