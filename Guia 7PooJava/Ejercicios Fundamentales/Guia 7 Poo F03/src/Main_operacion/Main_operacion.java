
package Main_operacion;

import Servicio_operacin.Servicio_operacion;


public class Main_operacion {

   
    public static void main(String[] args) {
      
        Servicio_operacion s1 = new Servicio_operacion();
        s1.crearOperacion();
        
        System.out.println("La suma es " + s1.sumar()); 
        System.out.println("La resta es "+s1.restar()); 
        if (s1.multiplicar()==0){
            System.out.println("esta multiplicando por cero");
        }else {
            System.out.println("La multiplicación es "+s1.multiplicar());  
        }
        if (s1.dividir()==0){
            System.out.println("esta dividiendo por cero");
        }else {
            System.out.println("La division es "+s1.dividir());   
        } 
      
    }
    
}
