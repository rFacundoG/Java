import java.util.ArrayList;
import java.util.Scanner;

public class InformeAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        // Este método lee todo hasta el final de la línea, incluyendo el carácter de nueva línea.
        scanner.nextLine(); // Consumir la línea restante

        // Listas para almacenar la información de los alumnos
        ArrayList<Integer> legajos = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> notas1 = new ArrayList<>();
        ArrayList<Integer> notas2 = new ArrayList<>();
        ArrayList<Integer> notas3 = new ArrayList<>();
        ArrayList<String> condiciones = new ArrayList<>();

        // Variables para contar los alumnos en cada condición
        int cantidadPromocionados = 0;
        int cantidadRegulares = 0;
        int cantidadLibres = 0;

        int i = 0;

        while (i < cantidadAlumnos) {
            System.out.println("Ingrese los datos del alumno " + (i + 1) + ":");

            System.out.print("Nro Legajo: ");
            int nroLegajo = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea restante

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Nota 1: ");
            int nota1 = scanner.nextInt();

            System.out.print("Nota 2: ");
            int nota2 = scanner.nextInt();

            System.out.print("Nota 3: ");
            int nota3 = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea restante

            // Determinar la condición del alumno
            String condicion;
            if (nota1 >= 6 && nota2 >= 6 && nota3 >= 6) {
                condicion = "Promociona";
                cantidadPromocionados++;
            } else if ((nota1 >= 6 && nota2 >= 6) || (nota1 >= 6 && nota3 >= 6) || (nota2 >= 6 && nota3 >= 6)) {
                condicion = "Regular";
                cantidadRegulares++;
            } else {
                condicion = "Libre";
                cantidadLibres++;
            }

            // Agregar los datos del alumno a las listas
            legajos.add(nroLegajo);
            apellidos.add(apellido);
            nombres.add(nombre);
            notas1.add(nota1);
            notas2.add(nota2);
            notas3.add(nota3);
            condiciones.add(condicion);

            i++;
        }

        // Encabezado de la tabla de salida
        System.out.println("\nNro Legajo\tApellido\tNombre\t\tNota1\tNota2\tNota3\tCondicion");

        // Imprimir los datos de todos los alumnos
        for (int j = 0; j < legajos.size(); j++) {
            System.out.println(legajos.get(j) + "\t\t" + apellidos.get(j) + "\t\t" + nombres.get(j) + "\t\t" +
                               notas1.get(j) + "\t" + notas2.get(j) + "\t" + notas3.get(j) + "\t" + condiciones.get(j));
        }

        // Imprimir los totales
        System.out.println("\nCantidad de alumnos Promocionados: " + cantidadPromocionados);
        System.out.println("Cantidad de alumnos Regulares: " + cantidadRegulares);
        System.out.println("Cantidad de alumnos Libres: " + cantidadLibres);

        scanner.close();
    }
}
