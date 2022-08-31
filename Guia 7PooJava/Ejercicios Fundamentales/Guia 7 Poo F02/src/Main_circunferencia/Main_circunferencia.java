
package Main_circunferencia;

import Servicio.Servicio_circunferencia;

public class Main_circunferencia {

    public static void main(String[] args) {
        
        Servicio_circunferencia s1 = new Servicio_circunferencia();
        s1.crearCircunferencia();
        
        System.out.println("el area de la circunferencia es " + s1.calcularArea());
        System.out.println("el perimetro de la circunferencia es " + s1.calcularPerimetro());
        
    }
    
}
