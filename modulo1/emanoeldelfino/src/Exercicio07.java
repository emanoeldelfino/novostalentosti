/*
7) Faça um programa que calcule o valor da multa por atraso de pagamento de um boleto bancário. Solicite o valor do boleto e o percentual de multa.
*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        final float billetValue, finePerc, fineValue, totalWithFine;

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do boleto: R$ ");
        billetValue = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Percentual da multa: ");
        finePerc = Integer.parseInt(sc.nextLine());

        fineValue  = billetValue * (finePerc / 100.0f);
        totalWithFine = billetValue + fineValue;

        System.out.println(String.format("\nO valor da multa por atraso de pagamento é de R$%.2f.", fineValue));
        System.out.println(String.format("O valor total do boleto a ser pago com a multa é de R$%.2f.\n", totalWithFine));
        sc.close();
    }
}
