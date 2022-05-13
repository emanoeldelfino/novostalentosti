/*
43)Escreva um algoritmo que calcule o numero de prateleiras necessárias para guardar uma quantidade informada de livros. Considerando que em média uma prateleira comporta 32 livros.
*/

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        int numBooks;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de livros: ");
        numBooks = sc.nextInt();

        if (numBooks <= 0) {
            System.out.printf("\nQuantidade inválida: %d.\n", numBooks);
        } else {
            int numShelves = (int)Math.ceil((double)numBooks / 32.0);
            System.out.printf("\nO número de prateleiras necessárias é %d.\n", numShelves);
        }

        sc.close();
    }
}
