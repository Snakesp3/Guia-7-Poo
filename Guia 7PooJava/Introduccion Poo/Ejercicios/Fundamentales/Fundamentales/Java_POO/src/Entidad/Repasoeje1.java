/*repaso 01) Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/


package Entidad;


public class Repasoeje1 {

    public int ISBN;
    public String Titulo;
    public String AutorLibro;
    public int NumerodePaginas;       

    public Repasoeje1() {
    }

    public Repasoeje1(int ISBN, String Titulo, String AutorLibro, int NumerodePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.AutorLibro = AutorLibro;
        this.NumerodePaginas = NumerodePaginas;
    }

    @Override
    public String toString() {
        return "Repasoeje1 + \n ISBN del libro: " + ISBN + "\n Titulo del libro: " + Titulo + "\n Autor del libro: " + AutorLibro + "\n Numero de Paginas: " + NumerodePaginas;
    }



    
}
