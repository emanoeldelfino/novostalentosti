import java.util.Arrays;
import java.util.Scanner;

public class Exercicio77 {
    static final int SIZE = 10;
    public static void main(String[] args) {
        float[] numsList = new float[SIZE];
        float[] numsListM = new float[SIZE];
        float multiplier;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Número %d: ", i + 1);
            numsList[i] = Float.parseFloat(sc.nextLine().replace(",", "."));
        }

        System.out.print("Multiplicador: ");
        multiplier = Float.parseFloat(sc.nextLine().replace(",", "."));

        for (int i = 0; i < SIZE; i++) {
            // numsList[i] *= multiplier;
            numsListM[i] = numsList[i] * multiplier;
        }

        System.out.printf("\nLista original: %s.", Arrays.toString(numsList));
        System.out.printf("\nLista multiplicador: %s.\n\n", Arrays.toString(numsListM));

        sc.close();
    }
}
