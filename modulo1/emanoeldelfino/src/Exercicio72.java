import java.util.Arrays;
import java.util.Scanner;

/*
Faça um programa que receba dez números e armazene em uma lista.
Em seguida percorra toda a lista mostrando apenas os números 
que cujo valor seja superior a 10.
*/

public class Exercicio72 {
    static final int SIZE = 10;
    public static void main(String[] args) {
        int[] numsList = new int[SIZE];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Número %d: ", i + 1);
            numsList[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(numsList));

        for (int i = 0; i < SIZE; i++) {
            if (numsList[i] > 10) { // FILTRO
                System.out.println(numsList[i]);
            }
        }

        sc.close();
    }
}
