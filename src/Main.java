import clases.Biblioteca;
import clases.Libro;

import java.lang.runtime.SwitchBootstraps;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



    //Para instanciar un objeto o una variable: tipo de dato o clase
    //nombre o etiqueta y luego el valor después del igual
        // importante: cuando estoy instanciando un nuevo objeto, se usa la palabra reservada new

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro);

        System.out.printf("1 - Agregar un nuevo libro");
        System.out.printf("2 - Buscar un libro");
        System.out.printf("3 - Ver todos los libros");
        int opcion = scanner.nextInt();

        Switch (opcion) {
            case 1:
                biblioteca.crearLibro();
                break;
            case 2:
                biblioteca.buscarLibro();
                break;
            case 3:
                biblioteca.listarLibros();
        }


    }
}