package co.edu.uniquindio.sigecim.backtracking;

public class ProblemaNDadosCombinacion extends ProblemaNDados {
    /*
    Considerando N dados de 6 caras y un valor M, implementar backtracking para generar todas
    las combinaciones únicas V, donde V es un vector (v₁, ..., vₙ) que representa los
    valores de cada dado. Cada vᵢ debe cumplir 1 ≤ vᵢ ≤ 6, la suma ∑vᵢ = M, y
    v₁ ≤ v₂ ≤ ... ≤ vₙ para evitar permutaciones repetidas.
    */
    public static void main(String[] args) {
        int n = 4;
        int m = 20;
        int[] v = new int[n];
        backtracking(v, n, m, 0, 1);
    }

    private static void backtracking(int[] v, int n, int m, int i, int start) {
        // Si hemos llenado todos los dados
        if (i == n) {
            // Verificamos si la suma de los valores de los dados es igual a m
            if (suma(v, 0) == m) {
                // Imprimimos la combinación actual
                imprimir(v, 0, m);
            }
        } else {
            // Si el valor inicial es mayor a 6, no es una combinación válida
            if (start > 6) {
                return;
            }
            // Asignamos el valor actual al dado en la posición i
            v[i] = start;
            // Llamada recursiva para el siguiente dado con el mismo valor inicial
            backtracking(v, n, m, i + 1, start);
            // Llamada recursiva para el mismo dado con el siguiente valor inicial
            backtracking(v, n, m, i, start + 1);
//            for (int j = start; j <= 6; j++) {
//                v[i] = j;
//                backtracking(v, n, m, i + 1, j);
//            }
        }
    }
}
