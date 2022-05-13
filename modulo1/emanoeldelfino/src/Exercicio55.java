/*
55) Faça um programa que apresente no final o somatório dos números de 1 até 100.
*/

public class Exercicio55 {
    private static final int MAX = 100;
    public static void main(String[] args) {
        int sum = 0;

        System.out.printf("\nSomatório de 1 até %d: \n\n", MAX);

        for (int i = 1; i <= MAX; i++) {
            System.out.printf("%d %c ", i, i < MAX - 1 ? '+' : '=');
            sum += i;
        }

        // int counter = 1;
        // while (counter <= 100) {
        //     counter++;
        //     sum += counter;
        // }

        // System.out.printf("\nSomatório dos números de 1 até 100: %d.\n\n", sum);
        System.out.println(sum + "\n");
    }
}
