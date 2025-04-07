
package gestion_biblioteca;


public class Libro {
    
private String titulo;
private String autor;

    public Libro(String titulo, String autor) { //Constructor parametrizado con dos parametros 

        this.titulo = titulo;
        this.autor = autor;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor;
    }
}
