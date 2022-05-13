/*
48)Escreva um programa que calcule o valor total de aluguel e taxas a serem cobrados de um morador. Solicite o valor do aluguel, o valor do condomínio, considere que o valor do metro cubico do gas é de R$ 1,80 e o valor da taxa de consumo de agua é de R$ 0,60 por metro cubico de agua consumida. Apresente também o valor de 5% do valor total do aluguel que pode ser dado como desconto caso seja pago 5 dias antes do vencimento.
*/

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        float rentVal, taxes, condoVal, m3gas, m3water, rentTotal, rentDiscount;

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do aluguel: R$ ");
        rentVal = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.print("Valor do condomínio: R$ ");
        condoVal = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.print("Gás (m³): ");
        m3gas = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.print("�?gua (m³): ");
        m3water = Float.parseFloat(sc.nextLine().replace(",", "."));

        rentTotal = rentVal + condoVal;

        taxes = (m3gas * 1.8f) + (m3water * .6f);

        rentDiscount = rentTotal * .05f;

        System.out.printf("\nO valor total do aluguel é de R$ %.2f.", rentTotal);
        System.out.printf("\nO valor total das taxas (gás e luz) é de R$ %.2f.", taxes);
        System.out.printf("\nO desconto do aluguel para pagamento 5 dias antes do vencimento é de R$ %.2f.\n\n", rentDiscount);
        sc.close();
    }
}
