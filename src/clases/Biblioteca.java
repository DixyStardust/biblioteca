package clases;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    //Constructor (siempre público)
    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro libro) {    };

    public Libro buscarLibro(String titulo) {    }

    public void listarLibros() {    }
}
