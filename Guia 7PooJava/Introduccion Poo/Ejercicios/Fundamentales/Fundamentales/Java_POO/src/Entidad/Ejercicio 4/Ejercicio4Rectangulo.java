/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio4Rectangulo {
    private int base;
    private int altura;
    public Scanner leer = new Scanner(System.in);
    public Ejercicio4Rectangulo() {
    }

    public Ejercicio4Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        System.out.println("ingrese base");
        this.base=leer.nextInt();
        System.out.println("ingrese altura");
        this.altura=leer.nextInt();
    }
   
    public int calcularsup (int base,int altura){
        int superficie=0;
        superficie= base*altura;
        return superficie;
    }
    
     public int calcularper (int base,int altura){
        int perim=0;
        perim= (2*base)+(2*altura);
        return perim;
    }
      
     public void dibuja (int base,int altura){
        
         for (int i = 0; i < base; i++) {
             for (int j = 0; j < altura; j++) {
                 System.out.print("*");
             }
             System.out.println("");
         }
     }
}
    
    

