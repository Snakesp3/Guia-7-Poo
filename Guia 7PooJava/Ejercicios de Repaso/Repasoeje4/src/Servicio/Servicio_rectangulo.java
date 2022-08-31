/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / 
Perímetro = (base + altura) * 2.*/
package Servicio;

import Entidad.Entidad_rectangulo;
import java.util.Scanner;

public class Servicio_rectangulo {

    Scanner leer = new Scanner(System.in);
    Entidad_rectangulo re1 = new Entidad_rectangulo();

    //Metodo crear Rectangulo
    public Entidad_rectangulo crearRectangulo() {
        System.out.println("Ingrese la base del Rectangulo");
        re1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del Rectangulo");
        re1.setAltura(leer.nextInt());
        return re1;
    }
    //Metodo calcular Superficie

    public double superficieRectangulo() {

        double superficie = re1.getBase() * re1.getAltura();
        return superficie;
    }
    //Metodo calcular Perimetro

    public double perimetroRectangulo() {

        double perimetro = (re1.getBase() + re1.getAltura()) * 2;
        return perimetro;
    }

    //Metodo dibujar rectangulo
    public void dibujarRectangulo() {
        for (int i = 0; i < re1.getBase(); i++) {
            for (int j = 0; j < re1.getAltura(); j++) {
                System.out.print(" *");
            }
            System.out.println(" * ");
        }
    }
}
