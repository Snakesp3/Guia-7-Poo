
package Servicio;

import Entidad.Entidad_matematica;
import java.util.Scanner;

/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
public class Servicio_matematica {

    Scanner leer = new Scanner(System.in);
    Entidad_matematica num = new Entidad_matematica();

    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
   
    public void devolverMayor() {
        System.out.println("Primer valor");
        num.setNum1(Math.random());
        
        if (num.getNum1()>=80) {
           num.setNum2(Math.random());
        }
            
        }
            
        }

    

    

