
package Entidad;

import java.util.Scanner;

/*/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
   tipo real. A continuación, se deben crear los siguientes métodos:
   a) Método constructor que inicialice el radio pasado como parámetro.
   b) Métodos get y set para el atributo radio de la clase Circunferencia.
   c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
   objeto.
   d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
   e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).*/
    
public class repa02 {
    Scanner leer = new Scanner(System.in);
    //Atributo privado
    private double radio;
    
    // Método constructor basio.

    public repa02() {
    }
    //a) Método constructor que inicialice el radio pasado como parámetro.
   
    public repa02(double radio) {
        this.radio = radio;
    }
    
    //b)Métodos get y set para el atributo radio de la clase Circunferencia.

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    //objeto.
      public void crearCircunferencia(){
          
          System.out.println("Ingrese el Radio de la Circunferencia");
          this.radio=leer.nextDouble();
        
    }
     //Método area(): para calcular el área de la circunferencia (Area = pi ∗ radio2).
    
      public double area (double area){
          
          return Math.PI*Math.pow(area,2);
       }
    
     //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ PI ∗ radio).
      
      public double perimetro (double perimetro){
          
          return 2 * Math.PI*radio;
          
      }

    @Override
    public String toString() {
        return "repa02{" + "leer=" + leer + ", radio=" + radio + '}';
    }

   
      
      
      
}
