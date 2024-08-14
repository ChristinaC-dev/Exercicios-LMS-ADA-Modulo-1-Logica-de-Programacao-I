package ArraysEStrings;

public class Exercicio7 {
    public static String[] soletrandoStr(String input) {
        String[] resultado = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            resultado[i] = String.valueOf(input.charAt(i));
        }
        return resultado;
    }

    public static void main(String[] args) {
        String[] resultado1 = soletrandoStr("hello");
        String[] resultado2 = soletrandoStr("world");

        for (String s : resultado1) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : resultado2) {
            System.out.print(s + " ");
        }
    }
}