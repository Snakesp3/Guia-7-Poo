/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*////


package javaguia6;

import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese un numero");
        num1 = Integer.parseInt(leer.next());
        System.out.println("Ingrese un numero");
        num2 = Integer.parseInt(leer.next());
        suma = num1 + num2;
        
        System.out.println(+num1+ " + " + num2+ " = " +suma);
        
    }
    
}
