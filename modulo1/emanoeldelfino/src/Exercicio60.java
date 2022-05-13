/*
60) Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a média do total.
*/

import java.util.Scanner;

public class Exercicio60 {
    private static final int QT = 10;
    public static void main(String[] args) {
        float number, sum = 0f, mean;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < QT; i++) {
            System.out.printf("Valor do %dº número: ", i+1);
            number = Float.parseFloat(sc.nextLine().replace(",", "."));
            sum += number;
        }

        mean = sum / (float)QT;

        System.out.printf("\nA soma dos valores é %.1f.", sum);
        System.out.printf("\nA média dos valores é %.1f.\n\n", mean);

        sc.close();
    }
}
