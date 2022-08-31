
package javaguia6;

public class EjerE2 {

    
    public static void main(String[] args) {
       /*EjeE 2)Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
         una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
         tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
         iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        int aux;
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;

        aux = 4;
        b = c;
        c = a;
        a = d;
        d = b;

        System.out.println("Valores reales a,b,c,d");
        
        System.out.print(" [a=3] "+c + " [b=4] " + aux + " [c=5] " + b + " [d=6] " + a + " ");
        System.out.println("");
        System.out.println("Valores intercambiados: ");
        System.out.print(" [b=c] "+b + " [c=a] " + c + " [a=d] " + a + " [d=b] " + d + " ");

        System.out.println("");

        
        
        
        
        
        
        
    }
    
}
