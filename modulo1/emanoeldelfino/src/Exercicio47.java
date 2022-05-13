/*
47)Escreva um algoritmo que calcule o valor de Imposto de Renda que uma Pessoa Física deve pagar de acordo com o valor total de seu rendimento anual: abaixo de R$19.200 isento, acima deste valor e até R$30.000 8%. Mais que R$30.000 anuais 11%.
*/

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        float incomeYearly, incomeTaxPerc, incomeTaxVal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Rendimento anual: R$ ");
        incomeYearly = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.println();

        if (incomeYearly > 0) {
            if (incomeYearly < 19_200) {
                System.out.println("Isento do imposto de renda.");
            } else {
                if (incomeYearly <= 30_000) {
                    incomeTaxPerc = 8;
                } else {
                    incomeTaxPerc = 11;
                }
                incomeTaxVal = incomeYearly * (incomeTaxPerc / 100f);

                System.out.printf("O valor do imposto de renda é de R$ %.2f.\n", incomeTaxVal);
            }
        } else {
            System.out.printf("Valor inválido: %.2f.\n", incomeYearly);
        }

        System.out.println();

        sc.close();
    }
}
