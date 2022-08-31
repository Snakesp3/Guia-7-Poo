
package Main_persona;

import Servicio.Servicio_Persona;


public class Main_persona {

   
    public static void main(String[] args) {

        Servicio_Persona s1 = new Servicio_Persona();

        Servicio_Persona[] p = new Servicio_Persona[4];
        int IMC;
        boolean ME;
        int debajo = 0;
        int encima = 0;
        int ideal = 0;
        int mayores = 0;
        int menores = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese los datos de la primer persona");
            s1.crearPersona();

            IMC = s1.calcularIMC();
            ME = s1.esMayorDeEdad();

            if (IMC < 1) {
                debajo += 1;
            } else if (IMC > 1) {
                encima += 1;
            } else {
                ideal += 1;
            }
            if (ME) {
                mayores += 1;
            } else {
                menores += 1;
            }
        }
        System.out.println(debajo + "");
        System.out.println(debajo + " están por debajo de su peso");
        System.out.println(encima + " están por encima de su peso");
        System.out.println(ideal + " están en su peso ideal");
        System.out.println(mayores + " son mayores de edad");
        System.out.println(menores + " son menores de edad");
    }

}
    
