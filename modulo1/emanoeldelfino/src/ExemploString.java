import java.util.Arrays;

public class ExemploString {
    public static void main(String[] args) {
        String text = "Universidade da Região de Joinville";
        char[] textArr = text.toCharArray();
        System.out.println(Arrays.toString(textArr));

        // retorna um caracter na posição informada
        System.out.println(text.charAt(0));

        // troca um ou mais caracteres por outros caracteres
        // Strings são objetos imutáveis
        // System.out.println(text.replace(" ", ","));
        text = text.replace(" ", ",");

        // corta o texto
        System.out.println(text.substring(26, 35));

        // quantos caracteres têm no texto
        System.out.println(text.length());

        System.out.println(text.split(","));

        String otherText = " \" no meio \" ";
        System.out.println(otherText);
    }
}
