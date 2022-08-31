
package Main_Class;

import Entidad.repa02;
import java.util.Scanner;


public class Main_repa02 {

  /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
   tipo real. A continuación, se deben crear los siguientes métodos:
   a) Método constructor que inicialice el radio pasado como parámetro.
   b) Métodos get y set para el atributo radio de la clase Circunferencia.
   c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
   objeto.
   d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
   e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).*/
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        repa02 circunferencia=new repa02();
        
        circunferencia.crearCircunferencia();
        
        System.out.println("El area de la Circunferencia es: "+circunferencia.area(circunferencia.getRadio()));
        System.out.println("");
        System.out.println("El perimetro de la Circunferencia es: "+circunferencia.perimetro(circunferencia.getRadio()));
        
        
        
        
        
    }
    
}
