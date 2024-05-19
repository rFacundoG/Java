package Arreglos.Ejercicios_DelProfe.A2023;

import java.util.Scanner;
/**Ejercicio 5:
Escriba un programa para calcular el promedio de 20 valores almacenados en un arreglo. Los valores deben ser ingresados por teclado. Además, determinar cuántos valores son mayores
que el promedio. Imprima:
    a) El promedio.
    b) La cantidad de valores mayores al promedio y la lista de valores.*/

public class Arreglos05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 20; // Cantidad de elementos en el arreglo
        int[] valores = new int[n];
        int suma = 0;
        double promedio;

        // Solicitar al usuario los 20 valores
        System.out.println("Ingrese 20 valores:");
        for (int i = 0; i < n; i++) {
            valores[i] = scanner.nextInt();
            suma += valores[i];
        }

        // Calcular el promedio
        promedio = (double) suma / n;

        // Determinar cuántos valores son mayores que el promedio
        int cantidadMayores = 0;
        for (int valor : valores) {
            if (valor > promedio) {
                cantidadMayores++;
            }
        }

        // Imprimir el promedio y la cantidad de valores mayores que el promedio
        System.out.println("El promedio es: " + promedio);
        System.out.println("La cantidad de valores mayores al promedio es: " + cantidadMayores);

        // Imprimir la lista de valores mayores que el promedio
        System.out.println("Valores mayores que el promedio:");
        for (int valor : valores) {
            if (valor > promedio) {
                System.out.println(valor);
            }
        }
        scanner.close();
    }
}
