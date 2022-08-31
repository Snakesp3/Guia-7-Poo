
package Main_Class;

import Entidad.repa03;
import java.util.Scanner;


public class Main_repa03 {

    
    /* Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        repa03 cop = new repa03();
        cop.crearOperacion();
        System.out.println("La suma de los dos numeros enteros son: " + cop.suma(cop.getNumero1(), cop.getNumero2()));
        System.out.println("La resta de los dos numeros enteros son: " + cop.resta(cop.getNumero1(), cop.getNumero2()));

        if (cop.getNumero1() == 0 || cop.getNumero2() == 0) {
            System.out.println("La multiplicacion da cero");
        } else {
            System.out.println("La multiplicacion es: " + cop.multiplicacion(cop.getNumero1(), cop.getNumero2()));
        }

        if (cop.getNumero1() == 0 || cop.getNumero2() == 0) {
            System.out.println("La divicion da cero");

        } else {
            System.out.println("La divicion es: " + cop.dividir(cop.getNumero1(), cop.getNumero2()));
        }

    }

}
