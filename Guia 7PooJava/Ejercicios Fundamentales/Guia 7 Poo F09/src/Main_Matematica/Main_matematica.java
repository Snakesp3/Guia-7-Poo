package Main_Matematica;

import Entidad.Clase_Matematica;
import Servicio.Servicio_Matematica;

public class Main_matematica {

    public static void main(String[] args) {

        Servicio_Matematica s1 = new Servicio_Matematica();
        Clase_Matematica m1 = s1.cargarNumeros();
        System.out.println("el primer numero es: " + m1.getNumero1());
        System.out.println("el segundo numero es: " + m1.getNumero2());
        System.out.println("el mayor valor es: " + s1.devolverMayor(m1));
        System.out.println("la potencia es: " + s1.calcularPotencia(m1));
        System.out.println("la raíz cuadrada del menor es: " + s1.calculaRaiz(m1));

    }

}
    

