
package Main_cuenta;

import Servicio_cuenta.Servicio_Cuenta;
import java.util.Scanner;


public class Main_cuenta {

    
    public static void main(String[] args) {

        Servicio_Cuenta s1 = new Servicio_Cuenta();
        Scanner leer = new Scanner(System.in);

        s1.CrearCuenta();
        int opcion;
        int CantDinero;

        do {
            System.out.println("");

            System.out.println("elija una opcion");
            System.out.println("1 ingresar dinero");
            System.out.println("2 retirar dinero");
            System.out.println("3 extraccion rapida");
            System.out.println("4 consultar saldo");
            System.out.println("5 consultar datos");
            System.out.println("6 salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("cuanto dinero desea ingresar");
                    CantDinero = leer.nextInt();
                    s1.Ingresar(CantDinero);
                    break;
                case 2:
                    System.out.println("cuanto dinero desea retirar");
                    CantDinero = leer.nextInt();
                    s1.Retirar(CantDinero);
                    break;
                case 3:
                    System.out.println("cuanto dinero desea retirar");
                    CantDinero = leer.nextInt();
                    s1.extraccionRapida(CantDinero);
                    break;
                case 4:
                    s1.consultarSaldo();
                    break;
                case 5:
                    s1.consultarDatos();
                    break;
            }
        } while (opcion != 6);
    }

}
 
