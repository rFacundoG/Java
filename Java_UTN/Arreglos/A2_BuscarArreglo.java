package Arreglos;

public class A2_BuscarArreglo {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50};
        int elementoABuscar = 30;
        boolean encontrado = false;

        for (int i = 0 ; i < arreglo.length ; i++) {
            if (arreglo[i] == elementoABuscar) {
                encontrado = true;
                System.out.println("Elemento " + elementoABuscar + " encontrado en el índice " + i);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Elemento " + elementoABuscar + " no encontrado");
        }
    }
}
