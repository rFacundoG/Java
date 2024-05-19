package Arreglos;

import java.util.Arrays;

public class A6_AgregaElemento {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50};
        int nuevoElemento = 60;

        // Crear un nuevo arreglo con un tamaño mayor
        int[] nuevoArreglo = Arrays.copyOf(arreglo, arreglo.length + 1);

        // Insertar el nuevo elemento en la última posición
        nuevoArreglo[nuevoArreglo.length - 1] = nuevoElemento;

        // Mostrar el nuevo arreglo
        System.out.println("Nuevo arreglo: " + Arrays.toString(nuevoArreglo));
    }
}
