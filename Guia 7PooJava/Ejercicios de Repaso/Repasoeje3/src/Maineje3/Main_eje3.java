package Maineje3;

import Entidad.Clase_eje3;
import Servicio_eje3.Servicio_eje3;


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
public class Main_eje3 {

    public static void main(String[] args) {
        Servicio_eje3 ope2 = new Servicio_eje3();
        Clase_eje3 ope3 = ope2.crearOperacion();
        
        System.out.println("El resultado de la suma es: " + ope2.suma(ope3.getNum1(), ope3.getNum2()));
        System.out.println("---------------------------");
        System.out.println("El resultado de la resta es: " + ope2.resta(ope3.getNum1(), ope3.getNum2()));
        System.out.println("----------------------------");
        System.out.println("El resultado de la multiplicacion es: " + ope2.multiplicar(ope3.getNum1(), ope3.getNum2()));
        System.out.println("------------------------------------");
        System.out.println("El resultado de la division es: " + ope2.dividir(ope3.getNum1(), ope3.getNum2()));
        System.out.println("------------------------------");
    }
}
