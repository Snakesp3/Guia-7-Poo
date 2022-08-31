
package Servicio;

import Entidad.Punto;
import java.util.Scanner;

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/
public class Servicio_punto {
   
      Scanner leer = new Scanner(System.in);
      Punto punto = new Punto();
    
    public Punto crearPunto(){
        
        System.out.println("Ingrese el primer punto");
        System.out.println("X1 --> ");
        punto.setX1(leer.nextInt());
        System.out.println("Y1 --> ");
        punto.setY1(leer.nextInt());
        
        System.out.println("Ingrese el segundo punto");
        System.out.println("X2 --> ");
        punto.setX2(leer.nextInt());
        System.out.println("Y2 --> ");
        punto.setY2(leer.nextInt());
        
        return punto;
    
    }
    
    public double calcularDistancia(){
    
        return Math.sqrt(Math.pow((punto.getX2()-punto.getX1()), 2)+ Math.pow((punto.getY2()-punto.getY1()), 2));
        
    }
    
    
    
}
