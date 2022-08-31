
package Main_rectangulo;

import Servicio_rectangulo.Servicio_Rectangulo;

public class Main_rectangulo {

   
    public static void main(String[] args) {
      
        
        Servicio_Rectangulo s1 = new Servicio_Rectangulo();
        s1.crearRectangulo();
        
        System.out.println("la superficie del rectangulo es " + s1.calcularSuperficie());
        System.out.println("el perimetro del rectangulo es " + s1.calcularPerimetro());
        s1.mostrarRectangulo();
        
    }
    
    
}
