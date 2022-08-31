
/*Repaso eje 2)Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).*/



package Entidad;

import java.util.Scanner;

/**
 *
 * @author Snakesp2
 */
public class Repasoeje22 {
    
    Scanner leer = new Scanner(System.in);
    private double radio;

    public Repasoeje22() {
       
    }
    public Repasoeje22(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void CrearCircunferencia1(){
        System.out.println("Ingrese el radio de la circunferencia");
        this.radio=leer.nextDouble();
      
        }
    public double area(double radio){
    return Math.PI * Math.pow(radio, 2);

     }
    
    public double perimetro(double radio) {
        return 2 * Math.PI * radio; 
    }

}
       

       

    
    
