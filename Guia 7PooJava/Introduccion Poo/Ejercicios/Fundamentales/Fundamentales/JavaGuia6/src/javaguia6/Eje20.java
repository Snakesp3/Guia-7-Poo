/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia6;

/**
 *
 * @author Snakesp2
 */
public class Eje20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        int cMagico[][] = {{2,7,6},{9,5,1},{4,3,8}};
        
        int sumaColumnas []= new int [cMagico.length];
        int sumaFilas=0;
        
        for(int i=0;i<cMagico.length;i++){
            for(int j=0;j<cMagico.length;j++){
                System.out.print("[ "+cMagico[i][j]+" ]");
                 sumaFilas += cMagico[i][j];
            }
            System.out.println("="+sumaFilas);
            System.out.println(" ");
            sumaFilas=0;
        }   
        
        
        
        
        
        
        
        
    }
    
}
