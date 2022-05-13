import java.util.Arrays;
import java.util.Scanner;

public class Exercicio74 {
    static final int SIZE = 10;
    public static void main(String[] args) {
        int[] numsList = new int[SIZE];
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Número %d: ", i + 1);
            numsList[i] = Integer.parseInt(sc.nextLine());
            if (numsList[i] < 10) {
                numsList[i] = 0;
            }
        }

        System.out.println(Arrays.toString(numsList));

        sc.close();
    }
}
