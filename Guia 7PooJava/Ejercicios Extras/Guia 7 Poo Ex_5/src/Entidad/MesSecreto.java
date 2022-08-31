
package Entidad;

import java.util.Scanner;

/*Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!*/
public class MesSecreto {
  
    Scanner leer = new Scanner(System.in);
    String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String mesSecreto = mes[1];

    public void adivinarMes() {

        System.out.println("Adivine el mes escribiendolo en minuscula: ");

        String a = leer.next();

        while (!a.equals(mesSecreto)) {

            System.out.println("No has acertado. Intentalo nuevamente: ");
            a = leer.next();
        }

        System.out.println("Ha acertado!!!!");
    }

    
    
    
    
}
