
package Main;

import Entidad.Cancion;


public class Main_cancion {

    /*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
    además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
    otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
    definir los métodos getters y setters correspondientes.*/
    public static void main(String[] args) {
      
        Cancion cancion = new Cancion();
        cancion.setAutor("Elvis");
        cancion.setTitulo("Cocho");
        System.out.println(cancion.getAutor()+" "+ cancion.getTitulo());
        
        
        
        
        
    }
    
}
