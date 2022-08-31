package javaguia6;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Snakesp2
 */
public class Eje8 {

    /**
     * @param args the command line arguments
     */
    
    //Ejercicio Nº8
    public static void main(String[] args) {
       
       
    Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingrese la nota");
        
        int nota = leer.nextInt();
        
        while (nota<0 || nota>10){
            System.out.println("Ingrese nuevamente la nota");
            nota = leer.nextInt();
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
