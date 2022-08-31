
package Entidad;


public class Clase_Cadena {
    
      private String frase;
    private int longitud;

    public Clase_Cadena() {
    }

    public Clase_Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
   
}
