/*
8) Faça um programa que receba um número real, encontre e mostre:  2.5
     - a parte inteira desse número; 2 (arredondamento, conversão de float pra int)
     - a parte fracionária desse número; 0.5 (o numero original e subtrair a parte inteira)
     - o arredondamento desse número; 3 (fazer o arredondamento)
*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        final float realNum, fractionPartNum;
        final int intPartNum, roundedNum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número real: ");
        realNum = Float.parseFloat(sc.nextLine().replace(",", "."));

        // parteInteiraNum = (int)Math.ceil(numReal);
        intPartNum = (int)realNum;
        // parteFracionariaNum = numReal % 1;
        fractionPartNum = realNum - intPartNum;
        roundedNum = Math.round(realNum);

        System.out.println(String.format("\nParte inteira do número: %d.", intPartNum));
        System.out.println(String.format("Parte fracionária do número: %f.", fractionPartNum));
        System.out.println(String.format("Número arredondado: %d\n", roundedNum));
        sc.close();
    }
}
