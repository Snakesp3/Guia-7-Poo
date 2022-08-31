
package Servicio;

import Entidad.Entidad_cafetera;
import java.util.Scanner;

/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad mÃ¡xima de cafÃ© que puede contener la cafetera) y cantidadActual (la cantidad
actual de cafÃ© que hay en la cafetera). Implemente, al menos, los siguientes mÃ©todos:
â€¢ Constructor predeterminado o vacÃ­o
â€¢ Constructor con la capacidad mÃ¡xima y la cantidad actual
â€¢ MÃ©todos getters y setters.
â€¢ MÃ©todo llenarCafetera(): hace que la cantidad actual sea igual a la capacidad mÃ¡xima.
â€¢ MÃ©todo servirTaza(int): se pide el tamaÃ±o de una taza vacÃ­a, el mÃ©todo recibe el
tamaÃ±o de la taza y simula la acciÃ³n de servir la taza con la capacidad indicada. Si la
cantidad actual de cafÃ© â€œno alcanzaâ€� para llenar la taza, se sirve lo que quede. El
mÃ©todo le informarÃ¡ al usuario si se llenÃ³ o no la taza, y de no haberse llenado en
cuanto quedÃ³ la taza.
â€¢ MÃ©todo vaciarCafetera(): pone la cantidad de cafÃ© actual en cero.
â€¢ MÃ©todo agregarCafe(int): se le pide al usuario una cantidad de cafÃ©, el mÃ©todo lo
recibe y se aÃ±ade a la cafetera la cantidad de cafÃ© indicada.*/
public class Servicio_cafetera {
     Scanner leer = new Scanner(System.in);
    Entidad_cafetera cafeL = new Entidad_cafetera();

    //MÃ©todo llenarCafetera(): hace que la cantidad actual sea igual a la capacidad mÃ¡xima.
    public void llenarCafetera() {
        System.out.println("***Capacidad Max 10000cc***");
        System.out.println("------------------------------------");
        System.out.println("***Cuantos CC quiere cargar de cafe***");
        cafeL.setCantidadActual(leer.nextInt());
        System.out.println("------------------------------------");
        {
            if (cafeL.getCantidadActual() <= 10000) {
                System.out.println("Se cargaron : " + cafeL.getCantidadActual() + "CC " +"de cafe");
            } else {
                System.out.println("La cantidad a cargar supera el Max");
            }

        }

    }

    /* MÃ©todo servirTaza(int): se pide el tamaÃ±o de una taza vacÃ­a, el mÃ©todo recibe el
    tamaÃ±o de la taza y simula la acciÃ³n de servir la taza con la capacidad indicada. Si la
    cantidad actual de cafÃ© â€œno alcanzaâ€� para llenar la taza, se sirve lo que quede.*/
    public void servirtaza() {
        System.out.println("*****************************");
        System.out.println("***Elija tamaño de Taza***");
        System.out.println("*****************************");
        System.out.println("Opcion 1");
        System.out.println("--> Taza Chica 100cc");
        System.out.println("Opcion 2");
        System.out.println("--> Taza Media 150cc");
        System.out.println("Opcion 3");
        System.out.println("--> Taza Grande 200cc");
        System.out.println("Opcion 4");
        System.out.println("-->Cantidad de cafe que contiene la maquina");
        System.out.println("Opcion 5");
        System.out.println("-->Salir");

        int opciones;
        do {
            System.out.print("Opcion--> ");
            opciones = leer.nextInt();
            int tazac = 100;
            int tazam = 150;
            int tazag = 200;

            switch (opciones) {
                case 1:
                    System.out.println("Elijio: Taza Chica");

                    cafeL.setCantidadActual(cafeL.getCantidadActual() - tazac);
                    System.out.println("Se resto de la cantidad actual de la cafetera: " + cafeL.getCantidadActual() + "cc");
                    //              opciones=0;

                    break;
                case 2:
                    System.out.println("Elijio: Taza Media");
                    cafeL.setCantidadActual(cafeL.getCantidadActual() - tazam);
                    System.out.println("Se resto de la cantidad actual de la cafetera: " + cafeL.getCantidadActual() + "cc");
                    //              opciones=0;
                    break;
                case 3:
                    System.out.println("Elijio: Taza Grande");
                    cafeL.setCantidadActual(cafeL.getCantidadActual() - tazag);
                    System.out.println("Se resto de la cantidad actual de la cafetera: " + cafeL.getCantidadActual() + "cc");
                    //             opciones=0;
                    break;
                case 4: 
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("La cantidad actual que contiene la maquina de cafe ahora es de: "+cafeL.getCantidadActual()+"CC");
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 5: 
                    System.out.println("***Gracias por probar nuestros cafe, vuelva pronto***");
                    break;
                   
                default:
                    System.out.println("Elija una opcion del 1 al 4");
            }
        } while (opciones > 0 && opciones < 5);
        
        
    }
}
