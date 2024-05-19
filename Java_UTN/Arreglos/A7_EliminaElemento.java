package Arreglos;

import java.util.Arrays;

public class A7_EliminaElemento {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50};
        int indiceAEliminar = 2;

        // Crear un nuevo arreglo con un tamaño menor
        int[] nuevoArreglo = new int[arreglo.length - 1];

        // Copiar los elementos al nuevo arreglo, excepto el que queremos eliminar
        for (int i = 0, j = 0; i < arreglo.length; i++) {
            if (i != indiceAEliminar) {
                nuevoArreglo[j++] = arreglo[i];
            }
        }

        // Mostrar el nuevo arreglo
        System.out.println("Nuevo arreglo: " + Arrays.toString(nuevoArreglo));
    }
}
