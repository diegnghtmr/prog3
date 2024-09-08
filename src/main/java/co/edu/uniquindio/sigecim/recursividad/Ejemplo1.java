package co.edu.uniquindio.sigecim.recursividad;

public class Ejemplo1 {
    public static void main(String[] args) {
        int num = 1234567890;
        System.out.println(contarCifrasNum(num));
    }

    private static int contarCifrasNum(int num) {
        if (num < 10) {
            return 1;
        } else {
            return 1 + contarCifrasNum(num / 10);
        }
    }

}
