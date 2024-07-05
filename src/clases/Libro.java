package clases;

import java.util.Random;

public abstract class Libro {
    Random random = new Random();
    private Integer id;
    private String titulo;
    private String autor;
    private Integer cantidadPaginas;
    private Genero generoLibro;

    //Constructor
    public Libro(String titulo, String autor, Integer cantidadPaginas, Genero generoLibro) {
        this.id = random.nextInt(101);
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
        this.generoLibro = generoLibro;
  }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getCantidadPaginas() {
        return cantidadPaginas;
    }


    @Override
    public String toString() {
        return "Libro{" +
                ", id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
                ", generoLibro=" + generoLibro +
                '}';
    }
}





