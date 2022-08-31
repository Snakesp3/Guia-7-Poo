
package Entidad;
//1)Es tu turno, crea tu propio proyecto con la clase Persona
//2)Seguiremos trabajando sobre la clase Persona que creamos y ahora deberás sumarle 3 atributos
//que creas pertinentes.
//3)Continuaremos con nuestra clase Persona y vamos a primero crear los getter y setter y después
//invocarlos desde el Main con alguno de los objetos que instanciaste.
//
//
public class Persona {

    public Persona(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }
  
    String Nombre;
    String Apellido;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    int Edad;
    
    
    
    
    
    
}
