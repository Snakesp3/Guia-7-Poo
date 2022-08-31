
package Main_Class;

import Entidad.Repasoeje3;




public class Repa3 {

    
    public static void main(String[] args) {
       
        
        Repasoeje3 operaciones=new Repasoeje3();
        
        operaciones.crearOperacion();
        System.out.println("La suma es: " +operaciones.suma(operaciones.getNumero1(),operaciones.getNumero2()));
        System.out.println("La resta es: " +operaciones.resta(operaciones.getNumero1(),operaciones.getNumero2()));
        
        if(operaciones.getNumero1()==0 || operaciones.numero2==0){
            System.out.println("Error en la Multiplicacion");
            
        }else{
            System.out.println("La multiplicacion es: " +operaciones.multiplicacion(operaciones.getNumero1(),operaciones.getNumero2()));
        }
        
        if(operaciones.getNumero1()==0 || operaciones.getNumero2()==0){
            System.out.println("Error en la division");
         
        }else{
            System.out.println("La division es: " +operaciones.division(operaciones.getNumero1(),operaciones.getNumero2()));
        }
      
    }
    
}
