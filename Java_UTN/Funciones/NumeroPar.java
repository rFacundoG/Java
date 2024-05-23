package Parcial_1.Java_UTN.Funciones;

import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero para saber si es par: ");
        int num = sc.nextInt();

        if (esPar(num)) {
            System.out.println(num + " es par");
        } else  {
            System.out.println(num + " es impar");
        }
    }

    public static boolean esPar(int x) {
        if ((x % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
