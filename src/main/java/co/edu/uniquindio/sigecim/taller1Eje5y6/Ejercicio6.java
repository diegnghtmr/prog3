package co.edu.uniquindio.sigecim.taller1Eje5y6;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Recorrer un array de forma recursiva
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9};
        int inicio = 0;
        int fin = vector.length-1;
        recorrerArrayV2(vector, inicio, fin);
    }

    private static void recorrerArrayV1(int[] vector, int inicio, int fin) {
        if (inicio <= fin) {
            System.out.println(vector[inicio]);
            recorrerArrayV1(vector, inicio + 1, fin);
        }
    }

    private static void recorrerArrayV2(int[] vector, int inicio, int fin) {
        if (fin >= inicio) {
            System.out.println(vector[fin]);
            recorrerArrayV2(vector, inicio, fin - 1);
        }
    }
}
