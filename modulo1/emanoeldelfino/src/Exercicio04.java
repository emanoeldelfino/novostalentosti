/*
4) Construa um programa que retorne o valor total da revelação de um filme de 24 poses, solicite o número de fotos reveladas. E considere que o valor unitário da revelação por foto é de R$ 0,90.
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        final int qtDevelopedPhotos;
        final float valueDevelopment;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de fotos reveladas: ");
        qtDevelopedPhotos = Integer.parseInt(sc.nextLine());

        valueDevelopment  = (qtDevelopedPhotos * .9f);

        System.out.println(String.format("\nO valor total da revelação é de R$%.2f.\n", valueDevelopment));
        sc.close();
    }
}
