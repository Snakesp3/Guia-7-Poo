/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/


package javaguia6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebasti G
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String nombre;
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingresa tu nombre");
        
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        JOptionPane.showMessageDialog(null, "Hola "+nombre);
        //System.out.println("Hola "+nombre);
        
    }
    
    
}
