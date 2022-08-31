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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int opcion;
        
        System.out.println("ingrese la opcion del 1 al 4");
        
        opcion = leer.nextInt();
        
        switch (opcion) {
            
            case 1: 
                 
                System.out.println("la bomba es una bomba de agua");
                  break;
            
            case 2: 
                  
                System.out.println("la bomba es una bomba de gasolina");
                  break;
                  
            case 3: 
                 
                System.out.println("la bomba es una bomba de hormigon");
                  break;      
                  
            case 4: 
                 
                System.out.println("la bomba es una bomba de pasta alimenticia");
                  break;      
                  
            default :
                
                System.out.println("su opcion es incorrecta");
        }
    }
}       
        
   

