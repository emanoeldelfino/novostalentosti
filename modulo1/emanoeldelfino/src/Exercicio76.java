import java.util.Scanner;

public class Exercicio76 {
    static final int SIZE = 10;
    public static void main(String[] args) {
        int[] numsList = new int[SIZE];
        int largest = 0, smallest = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Número %d: ", i + 1);
            numsList[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                largest = smallest = numsList[i];
            } else {
                if (numsList[i] < smallest) {
                    smallest = numsList[i];
                }
                if (numsList[i] > largest) {
                    largest = numsList[i];
                }
            }
        }

        System.out.printf("\nO maior valor dentro da lista foi %d.", largest);
        System.out.printf("\nO menor valor dentro da lista foi %d.", smallest);

        sc.close();
    }
}
