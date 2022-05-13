/*
51)Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo e o número de horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as regras abaixo:
a)    a hora trabalhada vale 1/8 do salário mínimo;
b)    a hora extra vale ¼ do salário mínimo;
c)    o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalha (apresente o valor para o usuário);
d)    a quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplicado pelo valor da hora extra(apresente o valor para o usuário);
e)    o salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras(apresente o valor para o usuário);
*/

import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        float workHoursMonth, minWage, overtimeMonth, grossSalary, overtimeValue, salary;

        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabalhadas (mês): ");
        workHoursMonth = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (workHoursMonth > 220) {
            System.out.println("Valor inválido! (Desconsidere hora extra)");
        } else {
            System.out.print("Salário mínimo: R$ ");
            minWage = Float.parseFloat(sc.nextLine().replace(",", "."));

            if (minWage < 0) {
                System.out.println("Valor inválido!");
            } else {
                System.out.print("Horas extras trabalhadas (mês): ");
                overtimeMonth = Float.parseFloat(sc.nextLine().replace(",", "."));

                if (overtimeMonth > 60) {
                    System.out.println("Valor inválido!");
                } else {
                    // grossSalary = workHoursMonth * (minSalary * (1f / 8f));
                    // overtimeValue = overtimeMonth * (minSalary * (1f / 4f));
                    grossSalary = workHoursMonth * (minWage / 8f);
                    overtimeValue = overtimeMonth * (minWage / 4f);
                    salary = grossSalary + overtimeValue;

                    System.out.printf("\nSalário bruto: R$ %.2f.", grossSalary);
                    System.out.printf("\nQuantia a receber pelas horas extras: R$ %.2f.", overtimeValue);

                    System.out.printf("\n\nSalário a receber: R$ %.2f.", salary);
                }
            }
        }

        sc.close();
    }
}
