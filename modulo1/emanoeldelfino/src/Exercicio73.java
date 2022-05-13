import java.util.Scanner;

public class Exercicio73 {
    static final int SIZE = 10;
    public static void main(String[] args) {
        int[] numsList = new int[SIZE];
        int oddTot = 0, evenTot = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            numsList[i] = Integer.parseInt(sc.nextLine());

            if (numsList[i] % 2 == 1) {
                oddTot++;
            } else {
                evenTot++;
            }
        }

        System.out.printf("\nForam digitados %d ímpares e %d pares.\n\n", oddTot, evenTot);

        sc.close();
    }
}
