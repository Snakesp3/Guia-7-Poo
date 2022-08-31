package Servicio;

import Entidad.Entidad_cafetera;
import java.util.Scanner;

/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
public class Servicio_cafetera {

    Scanner leer = new Scanner(System.in);
    Entidad_cafetera cafeL = new Entidad_cafetera();
    Entidad_cafetera cargar = new Entidad_cafetera();
    Entidad_cafetera agregar1 = new Entidad_cafetera();

    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera() {
        System.out.println("***Capacidad Max 10000cc***");
        System.out.println("------------------------------------");
        System.out.println("***Cuantos CC quiere cargar***");
        cafeL.setCantidadActual(leer.nextInt());
        System.out.println("------------------------------------");
        {
            if (cafeL.getCantidadActual() <= 10000) {
                System.out.println("Se cargaron : " + cafeL.getCantidadActual() + "CC " + "de cafe");
            } else {
                System.out.println("La cantidad a cargar supera el Max");
            }

        }

    }

    /* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.*/
    public void servirtaza() {

        System.out.println("                                 ***ATENCION!!!***");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("***Dato adicional:En el caso de no completar la cantidad de cafe en la taza solicitada***"
                + "\n***Solo se le cargara la cantidad que posee en ese momento la maquina*** ");
        System.out.println("--------------------------------------------------------------------------------------------");
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
        System.out.println("-->Cargar cafetera");
        System.out.println("Opcion 6");
        System.out.println("-->Vaciar Cafetera");
        System.out.println("Opcion 7");
        System.out.println("-->Salir");
        System.out.println("El contenido actual de la cafetera es de:" + cafeL.getCantidadActual() + "cc");
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
                    //System.out.println("Se resto de la cantidad actual de la cafetera: " + cafeL.getCantidadActual() + "cc");
                    //              opciones=0;

                    break;
                case 2:
                    System.out.println("Elijio: Taza Media");
                    cafeL.setCantidadActual(cafeL.getCantidadActual() - tazam);
                    // System.out.println("Se resto de la cantidad actual de la cafetera: " + cafeL.getCantidadActual() + "cc");
                    //              opciones=0;
                    break;
                case 3:
                    System.out.println("Elijio: Taza Grande");
                    cafeL.setCantidadActual(cafeL.getCantidadActual() - tazag);
                    //  System.out.println("Se resto de la cantidad actual de la cafetera: " + cafeL.getCantidadActual() + "cc");
                    //             opciones=0;
                    break;
                case 4:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("La cantidad actual que contiene la maquina de cafe ahora es de: " + cafeL.getCantidadActual() + "cc");
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("***Cuantos CC quiere cargar***");
                    cafeL.setCantidadActual(leer.nextInt());

                    break;
                case 6:
                    int cantidadActual = 0;
                    System.out.println("La cafetera se vacio por completo: " + cantidadActual + " cc " + "*Cantidad Actual*");
                    break;
                case 7:
                    System.out.println("***Gracias por probar nuestros cafe***\n          ***Vuelva Pronto***");
                    break;

                default:
                    System.out.println("Elija una opcion del 1 al 7");
            }
        } while (opciones > 0 && opciones < 7);
}
    public void cargarCafetera() {
        System.out.println("***Cuantos CC quiere cargar***");
        cargar.setCantidadActual(leer.nextInt());
        System.out.println("--------");
        cargar.setCantidadActual(cafeL.getCantidadActual() + cargar.getCantidadActual());
        System.out.println("La carga actual fue sumada con la carga reciente: " + cargar.getCantidadActual() + "cc");
    }

}

          
