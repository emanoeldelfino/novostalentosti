/*
61) Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecedor valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
*/

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        float number, sum = 0f, mean;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um valor maior ou igual a zero: ");
            number = sc.nextInt();

            if (number >= 0) {
                sum += number;
                count++;
            }
        } while (number >= 0);

        mean = sum / (float)count;

        System.out.printf("\nA soma dos valores digitados é %.1f.", sum);
        System.out.printf("\nA média dos valores digitados é %.1f.", mean);
        System.out.printf("\nForam lidos %d valores no total.\n\n", count);

        sc.close();
    }
}
