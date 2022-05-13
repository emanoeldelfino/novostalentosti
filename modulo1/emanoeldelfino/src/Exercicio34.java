/*
34)Faça um programa que receba o salário-base de um funcionário, 
calcule e mostre o salário a receber, sabendo-se que esse 
funcionário tem gratificação de 5% sobre o salário base e paga 
imposto de 7% sobre o salário-base.
*/

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        final float baseSalary, salaryToReceive, gratification, tax;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Salário base: R$ ");
        baseSalary = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (baseSalary <= 0) {
            System.out.println("Salário base inválido.");
            System.exit(1);
        }

        gratification = (baseSalary * (5f / 100f));
        tax = (baseSalary * (7f / 100f));

        System.out.printf("\nGratificação: R$ %.2f", gratification);
        System.out.printf("\nImposto: %.2f\n\n", tax);

        salaryToReceive = (baseSalary + gratification) - tax;
        // salaryToReceive = (baseSalary * .98f);

        System.out.printf("Salário a receber: R$ %.2f", salaryToReceive);

        sc.close();
    }
}
