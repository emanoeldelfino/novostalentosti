/*
35)O custo ao consumidor de um carro novo é a soma do preço da 
fábrica com o percentual de lucro do distribuidor e dos impostos
aplicados ao preço de fábrica. Faça um programa que receba o 
preço de fábrica de um veículo, o percentual de lucro do 
distribuidor e o percentual de impostos. Calcule e mostre:
a.    O valor correspondente ao lucro do distribuidor
b.    O valor correspondente aos impostos
c.    O preço final do veículo
*/

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        final float factoryPrice, profitPercent, taxPercent, profitValue, taxValue, finalPrice;
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço de fábrica do veículo: R$ ");
        factoryPrice = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Percentual de lucro do distribuidor: ");
        profitPercent = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Percentual de impostos: ");
        taxPercent = Float.parseFloat(sc.nextLine().replace(",", "."));

        profitValue = factoryPrice * (profitPercent / 100f);
        taxValue = factoryPrice * (taxPercent / 100f);
        finalPrice = factoryPrice + profitValue + taxValue;

        System.out.printf("\nLucro do distribuidor: R$ %.2f.", profitValue);
        System.out.printf("\nImposto: R$ %.2f.", taxValue);
        System.out.printf("\nPreço final do veículo: R$ %.2f.\n\n", finalPrice);

        sc.close();
    }
}
