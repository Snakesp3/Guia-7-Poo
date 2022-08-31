
package Main;

import Entidad.Punto;
import Servicio.Servicio_punto;

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/

public class Main_punto {

    
    public static void main(String[] args) {
       
        Servicio_punto sp = new Servicio_punto();
        Punto punto = sp.crearPunto();
        
        System.out.println("La distancia entre los punto es de ---> "+ sp.calcularDistancia());
     }
        
        
        
        
        
    }
    

