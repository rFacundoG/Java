import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlumnosTM_TT {
    public static void main(String[] args) {
        ArrayList<String> Alumnos = new ArrayList<>();
        ArrayList<String> AlumnosTM = new ArrayList<>();
        ArrayList<String> AlumnosTT = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            Menu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del Alumno: ");
                    String nuevoAlumno = scanner.nextLine();
                    AgregarAlumno(Alumnos, nuevoAlumno);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del Alumno a buscar: ");
                    String buscarAlumno = scanner.nextLine();
                    buscarAlumno(Alumnos, buscarAlumno);
                    break;
                case 3:
                    invertirAlumnos(Alumnos);
                    break;
                case 4:
                    System.out.println("Ingrese los Alumnos del turno Mañana (ingrese 'fin' para terminar): ");
                    llenarLista(AlumnosTM, scanner);
                    System.out.println("Ingrese los Alumnos del turno Tarde (ingrese 'fin' para terminar): ");
                    llenarLista(AlumnosTT, scanner);
                    break;
                case 5:
                    System.out.println("Lista de los Alumnos del turno Mañana: ");
                    mostrarLista(AlumnosTM);
                    break;
                case 6:
                    System.out.println("Lista de Alumnos del turno Tarde: ");
                    mostrarLista(AlumnosTT);
                case 7:
                    System.out.println("Alumnos del turno Mañana y Tarde: "+ALumnosTotal(AlumnosTM, AlumnosTT));
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida, intentelo de nuevo.");
                    break;
            }

        } while (opcion != 8);
        scanner.close();
    }

    public static void Menu() {
        System.out.println("Menu:");
        System.out.println("1. Agregar Alumno.");
        System.out.println("2. Buscar Alumno.");
        System.out.println("3. Invertir Alumnos.");
        System.out.println("4. Llenar listas de alumnos de turnos Mañana y Tarde.");
        System.out.println("5. Mostrar lista de alumnos del turno Mañana.");
        System.out.println("6. Mostrar lista de alumnos del turno Tarde.");
        System.out.println("7. Mostrar lista de ambos turnos.");
        System.out.println("8. Salir del programa.");
        System.out.print("Elige una opcion: ");
    }

    public static void AgregarAlumno(ArrayList<String> Alumnos, String nombreAlumno) {
        Alumnos.add(nombreAlumno);
        System.out.println("El Alumno fue agregado correctamente.");
    }

    public static void buscarAlumno(ArrayList<String> autos, String nombreAlumno) {
        int indice = autos.indexOf(nombreAlumno);
        if (indice != -1) {
            System.out.println("El alumno fue encontrado en la posicion: " + indice);
        } else {
            System.out.println("No se encontro el Alumno.");
        }
    }

    public static void invertirAlumnos(ArrayList<String> Alumnos) {
        Collections.reverse(Alumnos);
        System.out.println("Alumnos invertidos correctamente.");
        for (String elemento : Alumnos) {
            System.out.println(elemento);
        }
    }

    public static ArrayList<String> ALumnosTotal(ArrayList<String> AlumnosTM, ArrayList<String> AlumnosTT) {
        ArrayList<String> AlumnosTMyTT = new ArrayList<>();
        AlumnosTMyTT.addAll(AlumnosTM);
        AlumnosTMyTT.addAll(AlumnosTT);
        return AlumnosTMyTT;
    }

    public static void llenarLista(ArrayList<String> lista, Scanner scanner) {
        String newAlumnoTM;
        do {
            newAlumnoTM = scanner.nextLine();
            if (!newAlumnoTM.equalsIgnoreCase("fin")) {
                lista.add(newAlumnoTM);
            }
        } while (!newAlumnoTM.equalsIgnoreCase("fin"));
    }

    // Función para mostrar una lista de alumnos
    public static void mostrarLista(ArrayList<String> lista) {
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }
}
