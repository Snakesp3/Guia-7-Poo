

package Servicio;

import Entidad.Clase_eje1;
import java.util.Scanner;





/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/

public class ServicioEje1 {

 
   public void cargarlibro(){
       
       Scanner leer = new Scanner(System.in);
       Clase_eje1 L1 = new Clase_eje1();
       System.out.println("Ingrese ISBN del libro");
       L1.setISBN(leer.nextInt());
       System.out.println("Ingresar Titulo del libro");
       L1.setTitulo(leer.next());
       System.out.println("Ingrese el Autor del libro");
       L1.setAutor(leer.next());
       System.out.println("Ingrese Numero de Paginas del libro");
       L1.setNumeroDepagina(leer.nextInt());
       
       
       
   }
   
   
            
    
    
    
    
    
    
}
        
       
    
    
    

