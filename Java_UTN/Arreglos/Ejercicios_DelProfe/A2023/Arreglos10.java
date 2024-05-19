package Arreglos.Ejercicios_DelProfe.A2023;

import java.util.Scanner;
/*Ejercicio 10:
Escriba un algoritmo que lea un arreglo de numeros enteros, y un numero x, y escriba en la pantalla todos los indices de las posiciones del arreglo donde esta x. Por ejemplo, si el arreglo es el que aparece enseguida y x es 2: 1 2 3 100 23 2 2 1 El programa debe escribir: 1 5 6*/

public class Arreglos10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el numero de elementos en el arreglo
        System.out.println("Ingrese el numero de elementos en el arreglo:");
        int n = scanner.nextInt();

        // Crear un arreglo de enteros para almacenar los numeros
        int[] numeros = new int[n];

        // Leer los numeros enteros ingresados por el usuario
        System.out.println("Ingrese los numeros enteros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Solicitar al usuario el numero x a buscar en el arreglo
        System.out.println("Ingrese el numero x a buscar:");
        int x = scanner.nextInt();

        // Buscar el numero x en el arreglo e imprimir sus indices
        System.out.println("indices donde se encuentra el numero x:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] == x) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
