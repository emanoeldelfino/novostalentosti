/*
5) Construa um programa que mostre o percentual que uma despesa mensal representa do seu salário total.
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        final float monthSalary, monthExpense, expensePerc;

        Scanner sc = new Scanner(System.in);

        System.out.print("Salário mensal: R$ ");
        monthSalary = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Valor da despesa mensal: R$ ");
        monthExpense = Float.parseFloat(sc.nextLine().replace(",", "."));

        expensePerc  = (monthExpense * 100.0f) / monthSalary;

        System.out.println(String.format("\nO percentual do salário gasto nessa despesa é de %.2f%%.\n", expensePerc));
        sc.close();
    }
}
