/*
56) Elabore um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
*/

public class Exercicio56 {
    private static final int MAX = 500;
    public static void main(String[] args) {
        int sum = 0;

        System.out.printf("\nSomatório pares de 1 até %d:\n\n", MAX);

        for (int i = 2; i <= MAX; i += 2) {
            System.out.printf("%d %c ", i, i < MAX - 1 ? '+' : '=');
            sum += i;
        }

        System.out.println(sum + "\n");
    }
}
