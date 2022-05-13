/*
6) Construa um programa que calcule a quantidade total de ração consumida por um cachorro por mês. Solicite a quantidade consumida por refeição e o numero de refeições por dia.
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        final float qtPerMealKg, qtFoodDayG, qtMealsMonthKg;
        final int numRefeicoesDia;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de ração consumida por refeição pelo cahorro (kg): ");
        qtPerMealKg = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Número de refeições por dia feita pelo cahorro: ");
        numRefeicoesDia = Integer.parseInt(sc.nextLine());

        qtFoodDayG  = (float)numRefeicoesDia * qtPerMealKg;
        qtMealsMonthKg = (qtFoodDayG * 30.0f);

        System.out.println(String.format("\nQuantidade de ração consumida pelo cachorro ao mês é de %.2f kg.\n", qtMealsMonthKg));
        sc.close();
    }
}
