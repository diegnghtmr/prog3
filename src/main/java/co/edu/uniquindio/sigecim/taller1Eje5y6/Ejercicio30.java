package co.edu.uniquindio.sigecim.taller1Eje5y6;

public class Ejercicio30 {
    public static void main(String[] args) {
        String[][] matriz = {
            {"1", "2", "3"},
            {"5", "6", "7"},
            {"9", "10", "11"},
        };
        int giros = 2;
        int sizeFilas = matriz.length;
        int sizeColumnas = matriz[0].length;
        girarRuleta(matriz, giros, sizeFilas, sizeColumnas);
    }

    private static void girarRuleta(String[][] matriz, int giros, int sizeFilas, int sizeColumnas) {
    }

    private static void rotarMatriz(String[][] matriz,String[][] nuevaMatriz, int giros, int sizeFilas, int sizeColumnas,int  i, int j){
        if (i < sizeFilas && j < sizeColumnas) {
            nuevaMatriz[j][sizeFilas - i - 1] = matriz[i][j];
            rotarMatriz(matriz, nuevaMatriz, giros, sizeFilas, sizeColumnas, i + 1, j);
        }
    }
}
