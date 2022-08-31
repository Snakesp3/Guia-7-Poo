/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Ejercicio2Circunferencia {
    Scanner leer = new Scanner(System.in);
    private double radio;

    public Ejercicio2Circunferencia() {
    }

    public Ejercicio2Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        this.radio = leer.nextDouble();   
    
    }
    
    public double area(double radio){
        
        return Math.PI * Math.pow(radio, 2);
    
    }
    
    public double perimetro(double radio ){
        
        return 2* Math.PI * radio;
    
    
    }
    
    
    
}
