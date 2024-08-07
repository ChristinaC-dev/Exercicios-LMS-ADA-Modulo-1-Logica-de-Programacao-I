package EstruturasCondicionais;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercicio3 {
    public static void main(String[] args) {

        double[] input = {100.0, 2.0};
        double valorFinal = valorProdutoFinal(input);
        System.out.println("O valor final do produto é: " + valorFinal);
    }

    public static double valorProdutoFinal(double[] input) {
        if (input.length != 2) {
            throw new IllegalArgumentException("O array de entrada deve conter exatamente 2 elementos.");
        }

        double valorProduto = input[0];
        double estado = input[1];
        double taxaImposto;


        if (estado == 1.0) {
            taxaImposto = 0.07;
        } else if (estado == 2.0) {
            taxaImposto = 0.12;
        } else if (estado == 3.0) {
            taxaImposto = 0.15;
        } else {
            return -1.0;
        }


        double valorFinal = valorProduto * (1 + taxaImposto);


        BigDecimal valorFinalRounded = new BigDecimal(valorFinal).setScale(4, RoundingMode.HALF_UP);

        return valorFinalRounded.doubleValue();

    }
}


