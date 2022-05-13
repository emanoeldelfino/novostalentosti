/*
3) Faça um programa que calcule o valor de reembolso de despesas de combustível de um funcionário. Considere que o carro tem o consumo de 1 litro de gasolina a cada 13km rodado. E o preço do litro de gasolina é de R$ 2,20.
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        final float distanceKm, fuelLiters, fuelExpenses;

        Scanner sc = new Scanner(System.in);

        System.out.print("Distância rodada de ida e volta diária até a empresa em Km: ");
        distanceKm = Integer.parseInt(sc.nextLine());

        fuelLiters  = (distanceKm / 13.0f);
        fuelExpenses = (fuelLiters * 2.2f);

        System.out.println(String.format("\nO valor de reembolso de despesas de combustível é de R$%.2f.\n", fuelExpenses));
        sc.close();
    }
}
