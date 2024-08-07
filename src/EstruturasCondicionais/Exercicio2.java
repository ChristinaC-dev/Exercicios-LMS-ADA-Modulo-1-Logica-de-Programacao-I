package EstruturasCondicionais;

public class Exercicio2 {

    public static void main(String[] args) {

        double[] notas = {8.5, 7.0, 9.0, 8.0};
        String conceito = mediaAproveitamento(notas);
        System.out.println("O conceito do aluno é: " + conceito);
    }

    public static String mediaAproveitamento(double[] input) {
        if (input.length != 4) {
            throw new IllegalArgumentException("O array de entrada deve conter exatamente 4 elementos.");
        }

        double N1 = input[0];
        double N2 = input[1];
        double N3 = input[2];
        double mediaExercicios = input[3];


        double mediaAproveitamento = (N1 + N2 * 2 + N3 * 3 + mediaExercicios) / 7;


        if (mediaAproveitamento >= 9.0) {
            return "A";
        } else if (mediaAproveitamento >= 7.5) {
            return "B";
        } else if (mediaAproveitamento >= 6.0) {
            return "C";
        } else {
            return "D";
        }
    }
}
