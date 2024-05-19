package Arreglos;

public class A1_CargarArreglo {
    public static void main(String[] args) {
        // Declarar e inicializar un arreglo de 5 enteros
        int[] arreglo = new int[5];

        // Cargar el arreglo con valores
        // Posicion donde se guarda "arreglo[0]", valor asignado "10"
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        arreglo[3] = 40;
        arreglo[4] = 50;
        
        // También se puede inicializar directamente con valores
        int[] otroArreglo = {10, 20, 30, 40, 50};

        System.out.print(arreglo);
        System.out.print(otroArreglo);
    }
}
