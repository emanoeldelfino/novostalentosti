import java.util.Arrays;
import java.util.Scanner;

public class Exercicio81 {
    final static int SIZE = 3;
    public static void main(String[] args) {
        int[] x = new int[SIZE];
        int[] y = new int[SIZE];
        int[] union = new int[SIZE * 2];
        int[] diff = new int[SIZE];
        int[] sums = new int[SIZE];
        int[] products = new int[SIZE];
        int[] intersection = new int[SIZE];
        boolean found, foundUnion, foundDiff, foundIntersec;
        int unionIndex = SIZE, diffIndex = 0, intersecIndex = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            do {
                found = false;
                System.out.printf("Número %d de X: ", i + 1);
                x[i] = Integer.parseInt(sc.nextLine());
                for (int j = 0; j < i && !found; j++) {
                    if (x[i] == x[j]) {
                        found = true;
                        System.out.printf("Número %d já foi digitado, digite um novo número para X!\n\n", x[i]);
                    }
                }
            } while (found);
        }

        union = Arrays.copyOf(x, SIZE * 2);

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            do {
                found = false;
                System.out.printf("Número %d de Y: ", i + 1);
                y[i] = Integer.parseInt(sc.nextLine());
                for (int j = 0; j < i && !found; j++) {
                    if (y[i] == y[j]) {
                        found = true;
                        System.out.printf("Número %d já foi digitado, digite um novo número para Y!\n\n", x[i]);
                    }
                }
            } while (found);

            foundUnion = false;
            for (int j = 0; j < SIZE && !foundUnion; j++) {
                if (x[j] == y[i]) foundUnion = true;
            }

            if (!foundUnion) {
                union[unionIndex] = y[i];
                unionIndex++;
            }

            sums[i] = x[i] + y[i];
            products[i] = x[i] * y[i];

            foundIntersec = false;
            for (int j = 0; j < SIZE && !foundIntersec; j++) {
                if (x[j] == y[i]) foundIntersec = true;
            }

            if (foundIntersec) {
                intersection[intersecIndex] = x[i];
                intersecIndex++;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            foundDiff = false;
            for (int j = 0; j < SIZE && !foundDiff; j++) {
                if (x[i] == y[j]) foundDiff = true;
            }

            if (!foundDiff) {
                diff[diffIndex] = x[i];
                diffIndex++;
            }
        }

        union = Arrays.copyOfRange(union, 0, unionIndex);
        diff = Arrays.copyOfRange(diff, 0, diffIndex);
        intersection = Arrays.copyOfRange(intersection, 0, intersecIndex);

        System.out.printf("\nUnião dos vetores: %s.", Arrays.toString(union));
        System.out.printf("\nDiferença do vetor X para o vetor Y: %s.", Arrays.toString(diff));
        System.out.printf("\nSoma dos números dos vetores: %s.", Arrays.toString(sums));
        System.out.printf("\nProduto dos números dos vetores: %s.", Arrays.toString(products));
        System.out.printf("\nInterseção dos vetores: %s.\n\n", Arrays.toString(intersection));

        sc.close();
    }
}
