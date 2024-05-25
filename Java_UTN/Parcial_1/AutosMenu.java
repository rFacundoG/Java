
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AutosMenu {

    public static void main(String[] args) {
        ArrayList<String> autos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            Menu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                System.out.print("Ingrese el nombre del auto: ");
                String nuevoAuto = scanner.nextLine();
                    agregarAuto(autos, nuevoAuto);
                    break;
                case 2:
                    System.out.print("Introduce el auto a buscar: ");
                    String autoBuscar = scanner.nextLine();
                    buscarAuto(autos, autoBuscar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del auto a eliminar: ");
                    String autoEliminar = scanner.nextLine();
                    eliminarAuto(autos, autoEliminar);
                    break;
                case 4:
                    System.out.print(listAutos(autos));
                    break;
                case 5:
                    ordenarAutos(autos);
                    break;
                case 6:
                    System.out.print("Ingrese el indice del auto a editar: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre del auto: ");
                    String nuevoNombre = scanner.nextLine();
                    editarAuto(autos, indice, nuevoNombre);
                    break;
                case 7:
                    System.out.print("Saliendo...");
                    break;
                default:
                    System.out.print("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 7);
        
        scanner.close();
    }

    public static void Menu(){
        System.out.println("\nMenu:");
        System.out.println("1. Agregar Auto");
        System.out.println("2. Buscar Auto");
        System.out.println("3. Eliminar Auto");
        System.out.println("4. Mostrar todos los Autos");
        System.out.println("5. Ordenar Auto");
        System.out.println("6. Editar Auto");
        System.out.println("7. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void agregarAuto(ArrayList<String> autos, String nombreAuto) {
        autos.add(nombreAuto);
        System.out.println("Auto agregado.");
    }

    
    public static void buscarAuto(ArrayList<String> autos, String nombreAuto) {
        int indice = autos.indexOf(nombreAuto);
        if (indice != -1){
            System.out.println("auto encontrado en la posicion: "+indice);
        }else{
            System.out.println("auto no encontrado.");
        }
    }
    public static void eliminarAuto(ArrayList<String> autos, String nombreAuto) {
        if (autos.remove(nombreAuto)) {
            System.out.println("Auto eliminado.");
        } else {
            System.out.println("Auto no encontrado.");
        }
    }
    
    public static String listAutos(ArrayList<String> autos) {
        System.out.println("Lista de autos:");
        String listaAutos = "";
        for (String auto : autos) {
            listaAutos += auto+"\n";
        }
        return listaAutos;
    }
    

    public static void ordenarAutos(ArrayList<String> autos){
        Collections.sort(autos);
        System.out.println("autos ordenados alfabeticamente.");
    }

    public static void editarAuto(ArrayList<String> autos, int indice, String nombreAuto){
        if (indice >= 0 && indice < autos.size()){
            autos.set(indice, nombreAuto);
            System.out.println("Auto editado correctamente.");
        }else{
            System.out.println("Indice no valido.");
        }
    }
}
