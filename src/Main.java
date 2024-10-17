import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase Main proporciona un menú interactivo para que los usuarios
 * seleccionen una opcion sobre tipos de datos en Java y muestren información
 * relacionada con ellos.
 */
public class Main {

    /**
     * Método principal que presenta un menú al usuario para elegir una opción
     * y muestra información sobre diferentes tipos de datos primitivos en Java.
     *
     * @param args Los argumentos de la línea de comandos (no se usan en este programa).
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        System.out.println();
        DatosPrimitivos.getDefinicion();

        do {

            try {

            // Menú de opciones
            System.out.println();
            System.out.println("++++++ Ingrese la opción que desee para ver más info: ++++++");
            System.out.println("(1) boolean / (2) char / (3) enteros / (4) flotantes / (0) Exit");


            // Leer la opción ingresada por el usuario
            opcion = scanner.nextInt();

                // Muestra la información basada en la opción seleccionada
                switch (opcion) {
                    case 1:
                        System.out.println();
                        DatosPrimitivos.getBooleanInfo();
                        break;
                    case 2:
                        System.out.println();
                        DatosPrimitivos.getCaracterInfo();
                        break;
                    case 3:
                        System.out.println();
                        DatosPrimitivos.getEnterosInfo();
                        break;
                    case 4:
                        System.out.println();
                        DatosPrimitivos.getFlotantesInfo();
                        break;
                    default:
                        if (opcion!=0) {
                            System.out.println("Opción no válida.");
                        }
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error!! Debe ingresar un numero entero");
                scanner.next(); // Limpia la entrada no valida, sino entra en loop infinito.
            }

        } while (opcion != 0); // Continúa hasta que el usuario ingrese 0 para salir

        scanner.close();

    }

}
