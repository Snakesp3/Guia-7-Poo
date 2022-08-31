
package Entidad;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/


public class Clase_eje1 {
  
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDepagina;

    public Clase_eje1() {
    }

    public Clase_eje1(int ISBN, String Titulo, String Autor, int NumeroDepagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDepagina = NumeroDepagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroDepagina() {
        return NumeroDepagina;
    }

    public void setNumeroDepagina(int NumeroDepagina) {
        this.NumeroDepagina = NumeroDepagina;
    }

    @Override
    public String toString() {
        return "Clase_eje1{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDepagina=" + NumeroDepagina + '}';
    }
    
    
    
   
   
    
    
    
    
    
}
