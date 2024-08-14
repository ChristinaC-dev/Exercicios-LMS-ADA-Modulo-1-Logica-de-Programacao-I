package ArraysEStrings;

public class Exercicio1 {
    public static int somaAlgarismos(int input) {
        if (input <= 0) {
            return -1;
        }

        int soma = 0;
        while (input > 0) {
            soma += input % 10;
            input /= 10;
        }

        return soma;
    }

    public static void main(String[] args) {

        System.out.println(somaAlgarismos(251));
        System.out.println(somaAlgarismos(1234));
        System.out.println(somaAlgarismos(0));
        System.out.println(somaAlgarismos(-5));
    }
}