
import Entidad.Libro;
import java.util.Scanner;




public class Ejer1Poo {

    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        
        Libro l1= new Libro();
        
        System.out.print("Ingrese el ISBN ");
        l1.setISBN(leer.nextInt());
        
        System.out.print("Ingrese el Titulo ");
        l1.setTitulo(leer.next());
        
        System.out.print("Ingrese el Autor ");
        l1.setAutor(leer.next());
        
        System.out.print("Ingrese el Numero de paginas ");
        l1.setNumeroDepaginas(leer.nextInt());
        
        System.out.print(l1.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
