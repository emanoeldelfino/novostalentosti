/*
11) Faça um programa que receba o peso de uma pessoa, calcule e mostre:
   - o novo peso, se a pessoa engordar 15% sobre o peso digitado;
   - o novo peso, se a pessoa emagrecer 20% sobre o peso digitado.
*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        final float weight, weightPlus15, weightLess20;
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso (kg): ");
        weight = Float.parseFloat(sc.nextLine().replace(",", "."));
        weightPlus15 = (weight * 1.15f);
        weightLess20 = (weight * .8f);

        System.out.println(String.format("\nPeso se engordar 15%%: %.2f kg.", weightPlus15));
        System.out.println(String.format("Peso se emagrecer 20%%: %.2f kg.\n", weightLess20));

        sc.close();
    }
}
