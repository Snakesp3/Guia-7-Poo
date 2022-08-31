package Entidad;

import java.util.ArrayList;

public class Entidad_sucursal {

    public Entidad_sucursal() {
    }

    private String nombreSucursal;

    private ArrayList<Entidad_instrumento> instrumentos;

    public Entidad_sucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
        this.instrumentos = new ArrayList();
    }

    public void guardarInstrumentos(Entidad_instrumento instru) {
        instrumentos.add(instru);
    }

    public void listarInstrumentos(){
        
        for (Entidad_instrumento instrumento : instrumentos) {
            System.out.println("Los instrumentos son: " +instrumento.toString());
        }
        
        
    }
        
        
        
    }
