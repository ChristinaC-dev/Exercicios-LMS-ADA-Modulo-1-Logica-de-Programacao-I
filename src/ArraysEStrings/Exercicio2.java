package ArraysEStrings;

public class Exercicio2 {
    public static boolean elementosRepetidos(double[] input) {
        if (input == null || input.length < 2) {
            return false;
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        double[] array1 = {1.0, 2.0, 3.0, 4.0};
        double[] array2 = {1.0, 2.0, 2.0, 4.0};

        System.out.println(elementosRepetidos(array1));
        System.out.println(elementosRepetidos(array2));
    }
}
