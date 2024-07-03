package clases;

import java.util.Random;

public class Libro {
    Random random = new Random();
    private Integer id;
    private String titulo;
    private String autor;
    private Integer cantidadPaginas;

    //Constructor
    public Libro(String titulo, String autor, Integer cantidadPaginas) {
        this.id = random.nextInt(101);
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
  }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getCantidadPaginas {
        return cantidadPaginas;
    }

    @Override
    public String toString() {
        return "Libro {" +
                ", titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", cantidadPaginas = " + cantidadPaginas +
               '}';
    }

}





