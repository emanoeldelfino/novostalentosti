import java.util.Arrays;
import java.util.Scanner;

public class Exercicio78 {
    static final int SIZE = 10;
    public static void main(String[] args) {
        float[] numsList = new float[SIZE];
        float[] numsListReversed = new float[SIZE];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Número %d: ", i + 1);
            numsList[i] = Float.parseFloat(sc.nextLine().replace(",", "."));
        }

        int cont = 0;
        for (int i = SIZE - 1; i >= 0; i--) {
            numsListReversed[cont] = numsList[i];
            System.out.printf("\n%d %d", cont, i);
            cont++;
        }

        System.out.printf("\nLista original: %s.", Arrays.toString(numsList));
        System.out.printf("\nLista invertida: %s.", Arrays.toString(numsListReversed));
    
        sc.close();
    }
}
