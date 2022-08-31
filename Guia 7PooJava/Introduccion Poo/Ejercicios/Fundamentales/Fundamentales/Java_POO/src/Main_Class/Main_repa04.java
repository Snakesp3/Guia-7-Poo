
package Main_Class;

import Entidad.repa04;
import java.util.Scanner;


public class Main_repa04 {

    /*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        repa04 rectangulo= new repa04();   
        
        rectangulo.crearRectangulo();
        
        System.out.println("La superficie es: " +rectangulo.superficie(rectangulo.getBase(),rectangulo.getAltura()));
        System.out.println("El perimetro es: " +rectangulo.perimetro(rectangulo.getBase(),rectangulo.getAltura()));
        System.out.println("*********************************");
        System.out.println("El rectangulo seria: " );
        
        rectangulo.dibujarrectangulo();
        
        
        
        
        
        
        
    }
    
}
