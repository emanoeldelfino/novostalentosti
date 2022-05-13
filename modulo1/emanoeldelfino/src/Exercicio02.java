/*
2) Faça um programa para calcular a quantidade de carne necessária para um churrasco de acordo com
o número de pessoas convidadas. Considere que todas são adultas e que um adulto consome 250 gramas de carne por refeição.  
*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        final int numGuests;
        final float meatKg;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de convidados para o churrasco: ");
        numGuests = Integer.parseInt(sc.nextLine());

        meatKg  = (numGuests * 250.0f) / 1000.0f;

        System.out.println(String.format("\nO número de carne necessária é %.2f kg.\n", meatKg));
        sc.close();
    }
}
