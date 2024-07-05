package clases;

public class LibroFisico {
    private String editorial;
    private Edicion edicion;

    public LibroFisico(String editorial, Edicion edicion,String titulo, String autor, Integer cantidadPaginas, Genero generoLibro) {
        super();
        this.editorial = editorial;
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return super() +
                "LibroFisico{" +
                "editorial='" + editorial + '\'' +
                ", edicion=" + edicion +
                '}';
    }
}

