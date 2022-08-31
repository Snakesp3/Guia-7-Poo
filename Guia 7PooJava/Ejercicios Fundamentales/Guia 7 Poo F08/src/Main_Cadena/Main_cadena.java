
package Main_Cadena;

import Servicio.Servicio_Cadena;
import java.util.Scanner;


public class Main_cadena {

    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Servicio_Cadena s1 = new Servicio_Cadena();

        s1.crearCadena();
        int opcion;
        String frase = "";
        String letra = "";

        do {
            System.out.println("");
            System.out.println("elija una opcion");
            System.out.println("1 contabilizar la cantidad de vocales que tiene la frase");
            System.out.println("2 invertir la frase ingresada y mostrarla por pantalla");
            System.out.println("Ingresar otra frase y:");
            System.out.println("3 comparar la longitud de las frases");
            System.out.println("4 unir las frases");
            System.out.println("Ingresar un caracter y:");
            System.out.println("5 contabilizar cuántas veces se repite el carácter en la frase");
            System.out.println("6 reemplazar todas las letras “a” por el carácter ingresado");
            System.out.println("7 comprobar si la frase contiene el carácter ingresado");
            System.out.println("8 salir");
            opcion = leer.nextInt();

            if (opcion == 3 || opcion == 4) {
                System.out.println("ingrese la nueva frase");
                frase = leer.next();
            } else if (opcion == 5 || opcion == 6 || opcion == 7) {
                System.out.println("ingrese el caracter");
                letra = leer.next();
            }

            switch (opcion) {
                case 1:
                    System.out.println("la frase tiene " + s1.mostrarVocales() + " vocales");
                    break;
                case 2:
                    s1.invertirFrase();
                    break;
                case 3:
                    System.out.println(s1.compararLongitud(frase));
                    break;
                case 4:
                    s1.unirFrases(frase);
                    break;
                case 5:
                    s1.vecesRepetido(letra);
                    break;
                case 6:
                    s1.reemplazar(letra);
                    break;
                case 7:
                    System.out.println(s1.contiene(letra));
                    break;
            }
        } while (opcion != 8);
    }

}
    

