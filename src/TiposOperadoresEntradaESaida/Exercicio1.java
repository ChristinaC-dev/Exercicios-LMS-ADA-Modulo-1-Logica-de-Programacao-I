package TiposOperadoresEntradaESaida;

public class Exercicio1 {
    public static void main (String[] args) {

        int input[] = {28, 3, 3};
        int resposta = idadeEmDias(input);

        System.out.println("A idade em dias é: " + resposta);

    }

    public static int idadeEmDias(int[] input) {

        int anos = input[0];
        int meses = input[1];
        int dias = input[2];

        int totalEmDias = (anos*365) + (meses*30) + dias;

        return totalEmDias;
    }
}

