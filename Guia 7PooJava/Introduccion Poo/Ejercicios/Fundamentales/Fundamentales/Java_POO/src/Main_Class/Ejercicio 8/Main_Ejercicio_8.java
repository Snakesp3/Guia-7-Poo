/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Entidad.Ejercicio8Cadena;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Main_Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Ejercicio8Cadena c1 = new Ejercicio8Cadena();
        
        System.out.println("ingrese una frase");
        
        c1.setFrase(leer.next());
        
        c1.setLongitud(c1.getFrase().length());
        
        c1.vecesRepetido();
        
        System.out.println();
        
        
        
        
        
    }
    
}
