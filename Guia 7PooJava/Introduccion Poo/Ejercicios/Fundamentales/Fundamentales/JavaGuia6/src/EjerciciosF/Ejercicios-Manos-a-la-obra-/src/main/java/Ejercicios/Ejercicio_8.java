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
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa una nota que esté entre el 0 y el 10");
        int num = leer.nextInt();
        
        if (num>0 && num<10){
            System.out.println("El valor ingresado es: "+num);
        }else {
            System.out.println("La nota ingresada es incorrecta");
        }
    }
}