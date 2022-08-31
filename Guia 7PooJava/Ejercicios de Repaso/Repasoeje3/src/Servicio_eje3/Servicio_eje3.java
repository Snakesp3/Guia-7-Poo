package Servicio_eje3;

import Entidad.Clase_eje3;
import java.util.Scanner;

/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
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
public class Servicio_eje3 {

    //Método para crearOperacion
    Scanner leer = new Scanner(System.in);

    Clase_eje3 ope = new Clase_eje3();

    public Clase_eje3 crearOperacion() {

        System.out.println("Ingrese primer valor");
        ope.setNum1(leer.nextInt());

        System.out.println("Ingrese segundo valor");
        ope.setNum2(leer.nextInt());
        return ope;
    }

    //Método sumar
    public int suma(int num1, int num2) {

        return (num1 + num2);
    }

    //Método resta
    public int resta(int num1, int num2) {
        return (num1 - num2);
    }

    /* Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
     fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
     no, se hace la multiplicación y se devuelve el resultado al main*/
    public int multiplicar(int num1, int num2) {
        int resultado = 0;

        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR");
        } else {
            resultado = num1 * num2;
        }
        return resultado;

    }

    /*Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
     una división por cero, el método devuelve 0 y se le informa al usuario el error se le
     informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
    //Metodo Dividir
    public int dividir(int num1, int num2) {
        int resultado1 = 0;

        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR");
        } else {
            resultado1 = num1 / num2;
        }
        return resultado1;
    }
}
    
    
    
    

