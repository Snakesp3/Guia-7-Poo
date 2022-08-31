
package Entidad;

import java.util.Scanner;

/*2) Extras Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link: */
public class Ejercicio2Extra {

    Scanner leer = new Scanner(System.in);

    //Atributos
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Ejercicio2Extra() {
    }

    public Ejercicio2Extra(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //Metodo 1
    public void crearPuntos() {

        System.out.println("Ingrese la cordenada del primer punto");

        System.out.print(" x: ");
        x1 = leer.nextInt();
        System.out.print(" y: ");
        y1 = leer.nextInt();

        System.out.println("Ingrese la cordenada del segundo punto");

        System.out.print(" x: ");
        x2 = leer.nextInt();
        System.out.print(" y: ");
        y2 = leer.nextInt();

    }
    //Metodo 2

    public double calcularDistancia() {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    
    
    
    
    
    
    
}
