/*
62) Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado. Ao final deve ser apresentados o maior e o menor número informado pelo usuário.
*/

import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        int number, largest = 0, smallest = 0, count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um número maior ou igual a zero: ");
            number = Integer.parseInt(sc.nextLine());

            if (count == 0) {
                smallest = largest = number;
            } else if (number >= 0) {
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
            }

            count++;
        } while (number >= 0);

        System.out.printf("\nO maior número informado foi %d.", largest);
        System.out.printf("\nO menor número informado foi %d.\n\n", smallest);

        sc.close();
    }
}
