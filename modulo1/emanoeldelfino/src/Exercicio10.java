/*
10) Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa que receba o salário fixo do funcionário e o valor de suas vendas, calcule e mostre a comissão e seus salário final.
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        final float fixedSalary, salesValue, commission, finalSalary;

        Scanner sc = new Scanner(System.in);

        System.out.print("Salário fixo: R$ ");
        fixedSalary = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Valor de vendas: R$ ");
        salesValue = Float.parseFloat(sc.nextLine().replace(",", "."));

        commission = (salesValue * .04f);
        finalSalary = fixedSalary + commission;

        System.out.println(String.format("\nValor da comissão: R$%.2f", commission));
        System.out.println(String.format("Salário final: R$%.2f\n", finalSalary));

        sc.close();
    }
}
