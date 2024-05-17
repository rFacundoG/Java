package Parcial_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Crear_Listar_Archivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1) Crear un Archivo");
            System.out.println("2) Listar archivos");
            System.out.println("3) Salir");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        crearArchivo(scanner);
                        break;
                    case 2:
                        listarArchivos();
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número para seleccionar una opción.");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }
    }

    private static void crearArchivo(Scanner scanner) throws IOException {
        System.out.println("Ingrese el nombre del archivo a crear:");
        String nombreArchivo = scanner.nextLine();
        File archivo = new File(nombreArchivo);

        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
        } else {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente: " + archivo.getName());
            } else {
                System.out.println("No se pudo crear el archivo.");
            }
        }
    }

    private static void listarArchivos() {
        File directorioActual = new File(".");
        File[] listaArchivos = directorioActual.listFiles();

        if (listaArchivos != null && listaArchivos.length > 0) {
            System.out.println("Archivos en el directorio actual:");
            for (File archivo : listaArchivos) {
                if (archivo.isFile()) {
                    System.out.println(archivo.getName());
                }
            }
        } else {
            System.out.println("No hay archivos en el directorio actual.");
        }
    }
}
