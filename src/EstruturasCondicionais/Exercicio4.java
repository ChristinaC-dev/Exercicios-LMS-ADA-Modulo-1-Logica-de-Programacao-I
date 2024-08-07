package EstruturasCondicionais;

public class Exercicio4 {

    public static void main(String[] args) {

        int numero = 10;
        String resultado = geraSequenciaFibonacci(numero);
        System.out.println("A sequência de Fibonacci até " + numero + " é: " + resultado);
    }

    public static String geraSequenciaFibonacci(int input) {
        if (input < 0) {
            throw new IllegalArgumentException("O número de entrada deve ser um inteiro não negativo.");
        }

        StringBuilder sequencia = new StringBuilder();
        int a = 0, b = 1;


        sequencia.append(a);


        if (input == 0) {
            return sequencia.toString();
        }


        sequencia.append(", ").append(b);


        while (true) {
            int proximo = a + b;
            if (proximo > input) {
                break;
            }
            sequencia.append(", ").append(proximo);
            a = b;
            b = proximo;
        }

        return sequencia.toString();
    }
}
