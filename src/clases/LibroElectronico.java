package clases;

public class LibroElectronico {
    private FormatoDigital formatoDigital;
    private Double tamanioArchivo;
    private String dominio;

    public LibroElectronico(FormatoDigital formatoDigital, Double tamanioArchivo, String dominio, String autor, Integer cantidadPaginas, Genero generoLibro) {
        super();
        this.formatoDigital = formatoDigital;
        this.tamanioArchivo = tamanioArchivo;
        this.dominio = dominio;
    }

    @Override
    public String toString() {
        return super.toString() + "LibroElectronico{" +
                "formatoDigital=" + formatoDigital +
                ", tamanioArchivo=" + tamanioArchivo +
                ", dominio='" + dominio + '\'' +
                '}';
    }
}
