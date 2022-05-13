/*
1) Faça um programa que solicite o número de horas que um 
trabalhador realiza por dia, solicite o número de dias 
trabalhados em um mês e apresente o número total de horas 
trabalhadas no mês.
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        final float numHoursDay, numHoursMonth;
        final int numDaysMonth;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de horas trabalhadas por dia: ");
        numHoursDay = Float.parseFloat(sc.nextLine().replace(",", "."));;
        System.out.print("Número de dias trabalhados por mês: ");
        numDaysMonth = Integer.parseInt(sc.nextLine());

        numHoursMonth = numHoursDay * (float)numDaysMonth;

        System.out.println(String.format("\nO número de horas trabalhadas por mês é %.2f.\n", numHoursMonth));
        sc.close();
    }
}
