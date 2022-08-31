
package Entidad;


public class Libro {
    
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroDepaginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDepaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDepaginas = NumeroDepaginas;
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

    public int getNumeroDepaginas() {
        return NumeroDepaginas;
    }

    public void setNumeroDepaginas(int NumeroDepaginas) {
        this.NumeroDepaginas = NumeroDepaginas;
    }

    @Override
    public String toString() {
        return "Datos de Libro" +"\n"+ 
                "ISBN=" + ISBN +"\n"  
                + "Titulo=" + Titulo +"\n"  
                + "Autor=" + Autor +"\n"  
                + "Numero de paginas=" + NumeroDepaginas +"\n";   
                }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    

