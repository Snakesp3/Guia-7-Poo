/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Entidad.Ejercicio2Circunferencia;
import java.util.Scanner;

public class Main_Ejericicio_2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Ejercicio2Circunferencia circunferencia = new Ejercicio2Circunferencia();
        
        
        circunferencia.crearCircunferencia();
        System.out.println("El radio de la circunferencia es: "+circunferencia.area(circunferencia.getRadio()));
        System.out.println("El perimetro de la circunferencia es: "+circunferencia.perimetro(circunferencia.getRadio()));        
        
        
    }
    
}
