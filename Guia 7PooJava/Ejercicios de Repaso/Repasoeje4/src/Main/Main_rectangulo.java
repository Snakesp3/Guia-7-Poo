/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/
package Main;

import Entidad.Entidad_rectangulo;
import Servicio.Servicio_rectangulo;

public class Main_rectangulo {

    public static void main(String[] args) {

        Servicio_rectangulo rec = new Servicio_rectangulo();

        Entidad_rectangulo rec1 = rec.crearRectangulo();

        System.out.println("La Superficie es: " + rec.superficieRectangulo());
        System.out.println("----------------");
        System.out.println("El Perimetro es: " + rec.perimetroRectangulo());
        System.out.println("----------------");
        rec.dibujarRectangulo();
    }
}
