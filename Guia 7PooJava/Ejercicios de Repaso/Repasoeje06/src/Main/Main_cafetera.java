
package Main;

import Entidad.Entidad_cafetera;
import Servicio.Servicio_cafetera;

 class Main_cafetera {

   
    public static void main(String[] args) {
       
       Servicio_cafetera c1 = new Servicio_cafetera(); 
       Entidad_cafetera c2 = new Entidad_cafetera(); 
       c1.llenarCafetera();
       c1.servirtaza();
    }
    
}
