package co.edu.uniquindio.sigecim.taller1Eje5y6;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        Número de apariciones
        Recorra el arreglo desde la primera posición hasta la última posición y retorne el número
        de veces que se repite el elemento.  Parámetros: vector[] (arreglo en el cual se encuentran
        los elementos), inicio (es el inicio del vector), fin (es el fin del vector),
        elem (es el número a buscar dentro del arreglo)
         */
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 3, 3, 4, 6, 7, 8, 9, 7, 7, 7};
        int inicio = 0;
        int fin = vector.length-1;
        int elem = 7;
        System.out.println(numeroDeAparicionesV2(vector, inicio, fin, elem));
    }

    static int numeroDeAparicionesV1(int[] vector, int inicio, int fin, int elem) {
        // Caso base: si el índice inicial es mayor que el índice final, no hay más elementos que verificar.
        if (inicio > fin) {
            return 0;
        }

        // Si el elemento en la posición actual es igual al elemento buscado, incrementa el contador.
        if (vector[inicio] == elem) {
            return 1 + numeroDeAparicionesV1(vector, inicio + 1, fin, elem);
        }

        // Llamada recursiva para el siguiente elemento en el vector.
        return numeroDeAparicionesV1(vector, inicio + 1, fin, elem);
    }

    static int numeroDeAparicionesV2(int[] vector, int inicio, int fin, int elem) {
        // Caso base: si el índice final es menor que el índice inicial, no hay más elementos que verificar.
        if (fin < inicio) {
            return 0;
        }

        // Si el elemento en la posición actual es igual al elemento buscado, incrementa el contador.
        if (vector[fin] == elem) {
            return 1 + numeroDeAparicionesV2(vector, inicio, fin - 1, elem);
        }

        // Llamada recursiva para el siguiente elemento en el vector.
        return numeroDeAparicionesV2(vector, inicio, fin - 1, elem);
    }
}
