import java.util.Scanner;

public class Exercicio75 {
    static final int SIZE = 10;
    public static void main(String[] args) {
        int numsList[] = new int[SIZE];
        int sum = 0;
        float mean;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Número %d: ", i + 1);
            numsList[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < SIZE; i++) {
            sum += numsList[i];
        }

        mean = sum / (float)SIZE;

        System.out.printf("\nSoma: %d.", sum);
        System.out.printf("\nMédia: %.2f.\n\n", mean);

        sc.close();
    }
}
