
/*.Repaso eje 3) Crear una clase llamada Operacion que tenga como atributos privados numero1 y
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

package Entidad;

import java.util.Scanner;


public class Repasoeje3 {

    Scanner leer = new Scanner(System.in);
    public int numero1;
    public int numero2;

    public Repasoeje3() {
    }

    public Repasoeje3(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Repasoeje3{" + "leer=" + leer + ", numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

    public void crearOperacion() {

        System.out.println("Ingrese primer valor");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese segundo valor");
        this.numero2 = leer.nextInt();

    }

    public int suma(int numeri1, int numero2) {
        return numero1 + numero2;

    }

    public int resta(int numeri1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicacion(int numeri1, int numero2) {
        if (numero1 != 0 && numero2 != 0) {
            return numero1 * numero2;
        } else {

            return 0;
        }
    }

    public int division(int numeri1, int numero2) {

        if (numero1 != 0 && numero2 != 0) {
            return numero1 / numero2;

        } else {
            return 0;
        }
    }

}

       
   

         
        
    
    
    
    
    

