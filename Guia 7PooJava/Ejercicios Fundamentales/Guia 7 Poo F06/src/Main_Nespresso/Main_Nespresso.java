
package Main_Nespresso;

import Servicio.Servicio_Nespresso;
import java.util.Scanner;


public class Main_Nespresso {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Servicio_Nespresso s1 = new Servicio_Nespresso();

        s1.llenarCafetera();
        int opcion;

        do {
            System.out.println("");

            System.out.println("elija una opcion");
            System.out.println("1 servir taza");
            System.out.println("2 vaciar cafetera");
            System.out.println("3 agregar café");
            System.out.println("4 salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el tamaño de la taza vacía");
                    int taza = leer.nextInt();
                    s1.servirTaza(taza);
                    break;
                case 2:
                    s1.vaciarCafetera();
                    break;
                case 3:
                    System.out.println("ingrese la cantidad de café");
                    int cafe = leer.nextInt();
                    s1.agregarCafe(cafe);
                    break;
            }
        } while (opcion != 4);

    }

}
