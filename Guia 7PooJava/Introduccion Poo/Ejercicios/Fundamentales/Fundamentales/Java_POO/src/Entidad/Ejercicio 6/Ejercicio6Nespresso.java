/* Ejercicio 6) Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
 */
package Entidad;


public class Ejercicio6Nespresso {
    
    public int capacidadMaxima;
    public int cantidadActual;
    
    //Constructor predeterminado o vacío
   
    public Ejercicio6Nespresso() {
    }
    
    //Constructor con la capacidad máxima y la cantidad actual
    
    public Ejercicio6Nespresso(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    //Métodos getters y setters
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima
    
    public void llenarCafetera() {
        if (cantidadActual == capacidadMaxima){
            System.out.println("La cantidad actual es la cantidad maxima de cafe");
        }
       
    }

    
    //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    //cuanto quedó la taza.
    
    public int servirTaza(int servirTaza){
       
        
        return 0;
        
        
    }




}


    
    
    

