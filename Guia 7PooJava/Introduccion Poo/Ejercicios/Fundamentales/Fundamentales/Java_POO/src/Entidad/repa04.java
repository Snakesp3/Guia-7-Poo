
package Entidad;

import java.util.Scanner;



/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/

public class repa04 {
    //Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
    //base y un atributo privado altura.

    Scanner leer = new Scanner(System.in);

    private double base;
    private double altura;

    //Constructor sin parametros
    public repa04() {
    }

    //Constructor por parametros
    public repa04(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodos getter & setter
    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //La clase incluirá un método para crear el rectángulo con
    //los datos del Rectángulo dados por el usuario.
    public void crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura = leer.nextDouble();

    }
    // También incluirá un método para calcular la
    //superficie del rectángulo y un método para calcular el perímetro del rectángulo.

    public double superficie(double base, double altura) {

        return base * altura;

    }

    public double perimetro(double base, double altura) {

        return (base + altura) * 2;
    }

    //Por último,tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
    //altura.
    public void dibujarrectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == base - 1) {
                    System.out.print(" * ");
                } else if (j == 0 || j == altura-1) {
                    System.out.print(" * ");
                } else if (j > 0 && j < altura - 1 || i > 0 && i < base - 1) {

                    System.out.print("   ");

                }

            }
            System.out.println("");
        }
    }
}
