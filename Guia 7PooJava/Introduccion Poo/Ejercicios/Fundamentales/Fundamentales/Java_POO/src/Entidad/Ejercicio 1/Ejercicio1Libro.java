/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


public class Ejercicio1Libro {
    
    public int ISBN;
    public String autor;
    public String titulo;
    public int cant_pag;

    public Ejercicio1Libro() {
        
    }

    public Ejercicio1Libro(int ISBN, String autor, String titulo, int cant_pag) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.cant_pag = cant_pag;
    }

    @Override
    public String toString() {
        return "Libro" + "\n ISBN= " + ISBN + "\n autor= " + autor + "\n titulo= " + titulo + "\n cant_pag= " + cant_pag ;
    }
    
    
    
}
