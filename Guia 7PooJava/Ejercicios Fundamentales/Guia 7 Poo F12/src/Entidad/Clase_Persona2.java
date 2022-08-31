package Entidad;

import java.util.Date;

public class Clase_Persona2 {

    private String nombre;
    private Date fechaDeNacimiento;

    public Clase_Persona2() {
    }

    public Clase_Persona2(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Fecha de nacimiento: " + fechaDeNacimiento;
    }
}
