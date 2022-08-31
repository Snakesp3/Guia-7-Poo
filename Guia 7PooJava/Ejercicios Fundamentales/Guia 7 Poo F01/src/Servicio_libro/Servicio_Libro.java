
package Servicio_libro;

import Entidad.Libro;
import java.util.Scanner;


public class Servicio_Libro {
    
    Scanner Leer = new Scanner(System.in);   
    
    public Libro Cargar() {

        Libro L1 = new Libro();

        System.out.println("ingrese el ISBN del libro");
        L1.setISBN(Leer.nextInt());

        System.out.println("ingrese el Título del libro");
        L1.setTitulo(Leer.next());
        
        System.out.println("ingrese el Autor del libro");
        L1.setAutor(Leer.next());

        System.out.println("ingrese el Número de Páginas del libro");
        L1.setNumeroDePaginas(Leer.nextInt());

        return L1;
    }
    
        public void Mostrar(Libro L1) {
            
            System.out.println( L1.toString());
        }
}
