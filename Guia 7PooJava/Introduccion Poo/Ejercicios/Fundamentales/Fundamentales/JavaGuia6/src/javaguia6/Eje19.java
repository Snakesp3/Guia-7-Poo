
package javaguia6;

import java.util.Scanner;


public class Eje19 {

   
    public static void main(String[] args) {
        
        /*19)Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
         matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
         signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
         denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        
        Scanner leer = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int matrizb[][] = new int[3][3];
        int cont=0;
        System.out.println("Ingrese los valores de la matriz");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();

            }
            System.out.println(" ");

        }
        System.out.println("Matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }

            System.out.println(" ");

        }
        
        System.out.println("Matriz Transpuesta de A");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matriz[j][i] + "] ");
            }

            System.out.println(" ");

        }
        
        System.out.println("Matriz Opuesta de la Transpuesta de A");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + (- matriz[j][i]) + "] ");
                matrizb[i][j]= (- matriz[j][i]);
            }

            System.out.println(" ");

        }
        
        //System.out.println("Matriz Opuesta de la Transpuesta de A");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == matrizb[i][j]) {
                cont++;   

                }
               
            }

           

        }
        if (cont==9) {
            System.out.println("La Matriz A es anti simetrica");
        }else{
            System.out.println("La Matris A no es anti simetrica");
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
