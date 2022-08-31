
package Entidad;


public class Ahorcado {
 
    private String[] vector;
    private int cantLetraEncontrada;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] vector, int cantLetraEncontrada, int jugadasMax) {
        this.vector = vector;
        this.cantLetraEncontrada = cantLetraEncontrada;
        this.jugadasMax = jugadasMax;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getCantLetraEncontrada() {
        return cantLetraEncontrada;
    }

    public void setCantLetraEncontrada(int cantLetraEncontrada) {
        this.cantLetraEncontrada += cantLetraEncontrada;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    
    
    
    
    
    
    
}
