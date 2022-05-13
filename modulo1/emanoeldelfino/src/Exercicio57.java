/*
57) Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o valor de E, conforme a fórmula a seguir:
E = 1 + 1/(1!) + 1/(2!) + 1/(3!) + ... + 1/(N!)
5!= 5x4x3x2x1
*/

import java.util.Scanner;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Exercicio57 {
    public static void main(String[] args) {
        int num;
        // float eValue = 0f;
        BigDecimal eValue = BigDecimal.ZERO;

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor N: ");
        num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            // int factorial = 1;
            BigInteger factorial = BigInteger.ONE;
            // for (int j = i; j >= 1; j--)
            for (int j = 1; j <= i; j++) {
                factorial = factorial.multiply(BigInteger.valueOf(j));
            }

            System.out.printf("1 / (%d! := %d) %c ", i, factorial, i < num ? '+' : '=');

            eValue = eValue.add(BigDecimal.valueOf(1).divide(new BigDecimal(factorial), 15, RoundingMode.HALF_EVEN));
            // eValue += 1f / factorial;
        }

        System.out.println(eValue + "\n");

        sc.close();
    }
}
