package ArraysEStrings;

public class Exercicio4 {
    public static int primeiroCaractereUnico(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            boolean unico = true;

            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(j) == c) {
                    unico = false;
                    break;
                }
            }

            if (unico) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(primeiroCaractereUnico("swiss"));
        System.out.println(primeiroCaractereUnico("programming"));
        System.out.println(primeiroCaractereUnico("aabbcc"));
    }
}
