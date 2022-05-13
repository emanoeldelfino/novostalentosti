/*
39)Escreva o algoritmo de um programa que solicite dois números quaisquer ao usuário, se os números forem iguais mostre uma mensagem e mostre a media dos dois, caso contrário mostre qual o maior número e qual o menor número. 
*/

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        num1 = sc.nextInt();

        System.out.print("Número 2: ");
        num2 = sc.nextInt();

        System.out.println();

        if (num1 == num2) {
            System.out.printf("Média: %d", num1);
        } else if (num1 < num2) {
            System.out.printf("Menor: %d\nMaior: %d", num1, num2);
        } else {
            System.out.printf("Menor: %d\nMaior: %d", num2, num1);
        }

        System.out.println();

        sc.close();
    }
}
