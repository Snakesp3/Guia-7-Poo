
package Main_Class;

import Entidad.Repasoeje1;
import java.util.Scanner;


public class Repa1 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        Repasoeje1 libro = new Repasoeje1();
        System.out.print("Ingrese ISBN del libro: ");
        libro.ISBN=leer.nextInt();
        
        System.out.print("Ingrese Titulo del libro: ");
        libro.Titulo=leer.next();
        
        System.out.print("Ingrese Autor del libro: ");
        libro.AutorLibro=leer.next();
        
        
        System.out.print("Ingrese Numero de paginas del libro: ");
        libro.NumerodePaginas=leer.nextInt();
        
        System.out.println(""+ libro.toString());
   
    }
    
}
