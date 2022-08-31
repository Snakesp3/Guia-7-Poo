
/*package ejerciciosaprendizajeguia6;*/
import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        double num=leer.nextInt();
        
        System.out.println("El doble es: " +2*num+ " el triple es: " +3*num+ "y la raiz cuadrada es " + Math.sqrt(num));
    }
    
}

