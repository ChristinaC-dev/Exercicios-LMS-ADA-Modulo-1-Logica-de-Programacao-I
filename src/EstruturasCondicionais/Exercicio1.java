package EstruturasCondicionais;

public class Exercicio1 {

    public static void main(String[] args) {

        int[] lados = {3, 4, 5};
        boolean resultado = eUmTriangulo(lados);
        System.out.println("Os valores formam um triângulo? " + resultado);
    }

    public static boolean eUmTriangulo(int[] input) {
        if (input.length != 3) {
            throw new IllegalArgumentException("O array de entrada deve conter exatamente 3 elementos.");
        }

        int a = input[0];
        int b = input[1];
        int c = input[2];


        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
}
