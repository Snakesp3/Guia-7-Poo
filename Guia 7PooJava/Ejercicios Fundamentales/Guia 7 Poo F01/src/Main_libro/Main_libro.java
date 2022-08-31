
package Main_libro;

import Entidad.Libro;
import Servicio_libro.Servicio_Libro;


public class Main_libro {

    
    public static void main(String[] args) {
       
        
        Servicio_Libro LS = new Servicio_Libro();
        Libro L1 = LS.Cargar();
        LS.Mostrar(L1);
       
    }
    
}
