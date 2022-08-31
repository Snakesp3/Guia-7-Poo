
package Entidad;
/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad mÃ¡xima de cafÃ© que puede contener la cafetera) y cantidadActual (la cantidad
actual de cafÃ© que hay en la cafetera). Implemente, al menos, los siguientes mÃ©todos:
â€¢ Constructor predeterminado o vacÃ­o
â€¢ Constructor con la capacidad mÃ¡xima y la cantidad actual
â€¢ MÃ©todos getters y setters.
â€¢ MÃ©todo llenarCafetera(): hace que la cantidad actual sea igual a la capacidad mÃ¡xima.
â€¢ MÃ©todo servirTaza(int): se pide el tamaÃ±o de una taza vacÃ­a, el mÃ©todo recibe el
tamaÃ±o de la taza y simula la acciÃ³n de servir la taza con la capacidad indicada. Si la
cantidad actual de cafÃ© â€œno alcanzaâ€� para llenar la taza, se sirve lo que quede. El
mÃ©todo le informarÃ¡ al usuario si se llenÃ³ o no la taza, y de no haberse llenado en
cuanto quedÃ³ la taza.
â€¢ MÃ©todo vaciarCafetera(): pone la cantidad de cafÃ© actual en cero.
â€¢ MÃ©todo agregarCafe(int): se le pide al usuario una cantidad de cafÃ©, el mÃ©todo lo
recibe y se aÃ±ade a la cafetera la cantidad de cafÃ© indicada.*/

public class Entidad_cafetera {
   
     public int capacidadMaxima;
    public int cantidadActual;

    public Entidad_cafetera() {
    }

    public Entidad_cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

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
    
    
    
    
    
    
}
