package clases;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {

    Scanner scanner = new Scanner(System.in)
    //alcance, tipo de dato, etiqueta del atributo

    private ArrayList<Libro> libros;

    //Constructor
    //Siempre público. Se llama igual que la clase. Es el único método que va en mayúscula.
    //Parámetros que voy a necesitar para construir
    //Por dentro, la asignación de valores

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    //Alcance, Tipo de retorno, nombre del método, Parámetros (si no recibe los parámetros igual van los paréntesis)
    //Dentro de las llaves va la lógica, las lineas de ejecución

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado : " + libro.toString());
    }

    public Libro buscarLibro(String titulo) {
        //Necesito recorrer mi array de libros y preguntar si el libro pasado x parametro es igual
        // al titulo del libro que está revisando en esa iteración, si lo es necesito que lo retorne

        for (Libro libro: libros) {
            if (Objects.equals(libro.getTitulo(), titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro: libros) {
                System.out.println(libro);
            }
        }
    }

    public void crearLibro(){
        System.out.print("");
        String titulo = scanner.nextLine();
        String autor = scanner.nextLine();
        Integer cantidadPaginas = scanner.nextInt();

        libros.add(nuevoLibro);

    }
}
