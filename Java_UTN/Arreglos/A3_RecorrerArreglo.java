package Arreglos;

public class A3_RecorrerArreglo {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50};
        
        // Usando un bucle for tradicional
        for (int i = 0 ; i < arreglo.length ; i++) {
            System.out.println("Elemento en el índice " + i + ": " + arreglo[i]);
        }

        // Usando un bucle for-each
        for (int elemento : arreglo) {
            System.out.println("Elemento: " + elemento);
        }
    }
}

