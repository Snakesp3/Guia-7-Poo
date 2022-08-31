
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;


public class Servicio_circunferencia {
    
    Scanner leer = new Scanner(System.in);
    Circunferencia c1 = new Circunferencia();

    public void crearCircunferencia() {

        System.out.println("ingrese el radio");
        c1.setRadio(leer.nextDouble());
    }

    public double calcularArea() {

        double area = Math.PI * Math.pow(c1.getRadio(), 2);

        return area;
    }

    public double calcularPerimetro() {

        double perimetro = 2 * Math.PI * c1.getRadio();

        return perimetro;

    }
}