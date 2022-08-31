/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    
    /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        int cont=0;
        int suma=0;
        
        do {
            System.out.println("Ingrese 20 números aleatorios");
            num=leer.nextInt();
            cont++;
            if (num==0) {
               System.out.println("Se capturó el número 0");
               System.out.println("La suma de los números son: "+suma);
               break;
            }
            else {
                if (num>0) {
                    suma=suma+num;
                       }
              System.out.println("La suma de los números son: "+suma);  
            }
        } while (cont<20);
    }
}
