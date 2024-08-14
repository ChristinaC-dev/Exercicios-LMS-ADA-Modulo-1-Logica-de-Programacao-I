package ArraysEStrings;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
    public static String[] substringStr(String[] input) {
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i != j && input[j].contains(input[i])) {
                    substrings.add(input[i]);
                    break;
                }
            }
        }

        return substrings.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] palavras = {"ola", "ol", "hello", "hell", "lo", "world"};
        String[] resultado = substringStr(palavras);

        for (String palavra : resultado) {
            System.out.println(palavra);
        }
    }
}