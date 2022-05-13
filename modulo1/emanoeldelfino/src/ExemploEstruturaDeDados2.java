import java.util.Arrays;
import java.util.Scanner;

public class ExemploEstruturaDeDados2 {
    public static void main(String[] args) {
        int[] nums1 = new int[10];
        System.out.println(Arrays.toString(nums1));
        System.out.println(nums1[0]);
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(nums2[0]);

        char[] name1 = {'U', 'n', 'i', 'v', 'i', 'l', 'l', 'e'};
    
        for(char letter : name1) {
            System.out.printf("\n%c -> %d", letter, (int)letter);
        }

        String name2 = "Univille";
        System.out.println("\n\n" + name2.hashCode());

        System.out.println("\n" + name2);
        System.out.println(name2.toUpperCase());
        System.out.println(name2.toLowerCase() + "\n");

        name2 = "UNIVILLE";
        System.out.println(name2.hashCode() + "\n");

        // Strings são imutáveis. São um objeto imutável no Java.

        // String Compare usa hashCode por debaixo dos panos para
        // comparar strings.

        // Senhas geralmente são guardadas em banco de dados com
        // hashcode, e na hora de comparar se a senha está certa
        // é convertido a senha para hashcode e verificado se o
        // hashcode é o mesmo.

        // https usa chave pública e privada (do secure).

        // Gerenciadores de senha salvam a senha aberta, mas
        // usam um sistema de criptografia com chave pública e
        // privada para segurança.

        Scanner input = new Scanner(System.in);

        System.out.print("Digite UNIVILLE: ");
        String text = input.nextLine();

        // == não compara o conteúdo de Strings, mas suas
        // referências.
        // Java não dá acesso aos endereços de memória.
        // if (name2 == text) {
        // if (name2.equals(text)) {
        if (name2.equalsIgnoreCase(text)) {
            System.out.println("São iguais.");
        } else {
            System.out.println("Não são iguais.");
        }

        // Exercício 44 de comparação de strings

        // Garbage collector do Java limpa a memória quando
        // uma string nova é criada em cima de outra velha
        // Este nunca apaga o que está sendo usado no Java.

        input.close();
    }
}
