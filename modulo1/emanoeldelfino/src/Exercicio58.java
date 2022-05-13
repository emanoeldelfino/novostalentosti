/*
58) Faça um programa que leia um número N que indica quantos valores inteiros e positivos devem ser lidos a seguir. Para cada número lido, mostre o valor lido e o fatorial desse valor.
*/

import java.util.Scanner;
import java.math.BigInteger;

public class Exercicio58 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Quantidade de fatoriais a serem calculados: ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.printf("\nValor inválido: %d\n", num);
            }
        } while (num <= 0);

        for (int i = 0; i < num; i++) {
            // long fact = 1;
            BigInteger fact = BigInteger.ONE;
            int factNum;

            do {
                System.out.print("\nEntre com um inteiro positivo: ");
                factNum = sc.nextInt();
            } while (factNum < 0);

            for (int j = factNum; j >= 1; j--) {
                // fact *= j;
                fact = fact.multiply(BigInteger.valueOf(j));
            }

            System.out.printf("%d! = %d\n", factNum, fact);
        }

        System.out.println();

        sc.close();
    }
}
