package ArraysEStrings;

public class Exercicio6 {
    public static String[] soletrandoInvertidoStr(String input) {
        String[] resultado = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            resultado[i] = String.valueOf(input.charAt(input.length() - 1 - i));
        }
        return resultado;
    }

    public static void main(String[] args) {
        String[] resultado1 = soletrandoInvertidoStr("hello");
        String[] resultado2 = soletrandoInvertidoStr("world");

        for (String s : resultado1) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : resultado2) {
            System.out.print(s + " ");
        }
    }
}