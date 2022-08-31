
package Entidad;


public class Entidad_instrumento {

    private String id;
    private float precio;
    private Entidad_tipoDeInstrumento tipo;

    public Entidad_instrumento(String id, float precio, Entidad_tipoDeInstrumento tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
        
    }

    @Override
    public String toString() {
        return "Entidad_instrumento" + "id=" + id + ", precio=" + precio + ", tipo=" + tipo + "";
    }

    
    
    
    
    
    
}
