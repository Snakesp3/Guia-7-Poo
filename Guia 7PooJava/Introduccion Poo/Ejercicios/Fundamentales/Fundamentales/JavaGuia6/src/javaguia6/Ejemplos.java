/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia6;

import java.util.Scanner;

/**
 *
 * @author Snakesp2
 */
public class Ejemplos {

    
    public static void main(String[] args) {
        
        // Un ejempo de como se arma la estructura "SWITCH"
        
        //Scanner leer = new Scanner(System.in);
       /* int opciones;
        System.out.println("Opcion 1 Cafe Opcion 2 Té");
        opciones = leer.nextInt();
        switch (opciones){
            case 1:
                System.out.println("Cafe");
                System.out.println("Perfecto, en 5 tendremos su Cafe");
                break;
            
            case 2:
                System.out.println("Té");
                System.out.println("Perfecto, en 5 tendremos su TÉ");
                
                break;
                default:
                System.out.println("De otro mo se le servira: Chocolate Caliente");*/
                
               /* //EJERCICIO 8
                 //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
                // pedirá de nuevo hasta que la nota sea correcta.
       
                Scanner leer = new Scanner(System.in);
               
                System.out.println("Ingrese una nota");
                
                int nota;
                nota = leer.nextInt();
                
                while(nota<0 || nota>10){
                    System.out.println("Ingrese nuevamente la nota");
                
                    nota = leer.nextInt();*/
                
               
               
               /*EJERCICIO 9
               Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
               bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
               resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
               Nota: recordar el uso de la sentencia break.*/
               
               /*EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.*/
               
               
               
               Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String a=entrada.nextLine();
        
        int b = a.length();
        String c ;
       
        for (int i = 0; i < b; i++) {
            c = a.substring(i, i + 1).toUpperCase();

            if (c != ".") {
                switch (c) {
                    case "A":
                        c = "@";
                        break;
                    case "E":
                        c = "#";
                        break;
                    case "I":
                        c = "$";
                        break;
                    case "O":
                        c = "%";
                        break;
                    case "U":
                        c = "@";
                        break;
                    default:

                }
            } else {
                i = b;
            }

            System.out.print(c);
        }

    }

}

                   
                   
               
               
              
               
               
               
               
               
               
               
               
               
               
               
               
               
               /*EJERCICIO 10
               Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
               ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
               5 *****
               3 ***
               11 ***********
               2 ***/
        
               
               
        
       
                
                        
                
                
                
                
                
                
                
            
            
            
        

    
    
        
        
        
        
        
        
        
        
    
    
    
    
    
    
    

