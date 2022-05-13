/*
41)Escreva um algoritmo que calcule o número de páginas mínimo que um leitor deve ler para terminar um livro em um determinado numero de dias informado. Caso o número de paginas a ler por dia for maior que 100, informe ao usuário que  é impossível de realizar a leitura, caso contrário apresente o número de paginas.
*/

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        int numBookPages, numDays;
        float numPagesADay;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de páginas do livro: ");
        numBookPages = sc.nextInt();

        System.out.print("Número de dias para leitura: ");
        numDays = sc.nextInt();

        numPagesADay = numBookPages / numDays;

        if (numPagesADay > 100) {
            System.out.println("\n�?mpossível realizar a leitura.\n");
        } else {
            System.out.printf("\nNúmero de páginas a ler por dia: %.0f\n\n", numPagesADay);            
        }

        sc.close();
    }
}
