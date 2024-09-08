package co.edu.uniquindio.sigecim.backtracking;

public abstract class ProblemaNDados {

    static int suma(int[] v, int i) {
        // Caso base: si hemos llegado al final del array, retornamos 0
        if (i == v.length) {
            return 0;
        }
        // Caso recursivo: sumamos el valor actual y llamamos recursivamente con el siguiente índice
        return v[i] + suma(v, i + 1);
    }

    static void imprimir(int[] v, int i, int m) {
        // Si estamos en el primer elemento, imprimimos el paréntesis de apertura
        if (i == 0) {
            System.out.print("(");
        }
        // Si hemos llegado al final del array, imprimimos el paréntesis de cierre y el valor de la suma
        if (i == v.length) {
            System.out.println(") = " + m);
            return;
        }
        // Si no es el primer elemento, imprimimos una coma antes del valor
        if (i > 0) {
            System.out.print(", ");
        }
        // Imprimimos el valor actual del array
        System.out.print(v[i]);
        // Llamada recursiva para imprimir el siguiente valor
        imprimir(v, i + 1, m);
    }
}
