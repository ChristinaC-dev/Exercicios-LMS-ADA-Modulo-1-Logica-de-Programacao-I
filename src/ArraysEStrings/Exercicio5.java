package ArraysEStrings;

public class Exercicio5 {
    public static int numeroUnico(int[] input) {
        for (int i = 0; i < input.length; i++) {
            boolean unico = true;
            for (int j = 0; j < input.length; j++) {
                if (i != j && input[i] == input[j]) {
                    unico = false;
                    break;
                }
            }
            if (unico) {
                return input[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 3};
        int[] array2 = {4, 4, 5, 5, 6};
        int[] array3 = {7, 7, 8, 8};

        System.out.println(numeroUnico(array1));
        System.out.println(numeroUnico(array2));
        System.out.println(numeroUnico(array3));
    }
}
