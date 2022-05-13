import java.util.Scanner;

public class Exercicio75x {
    static final int NUM = 15;
    public static void main(String[] args) {
        int age, range1 = 0, range2 = 0, range3 = 0, range4 = 0, range5 = 0;
        float perc1, perc2, perc3, perc4, perc5;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= NUM; i++) {
            do {
                System.out.printf("Idade da pessoa %d: ", i);
                age = sc.nextInt();
            } while (age < 0 || age > 120);

            if (age <= 15) {
                range1++;
            } else if (age <= 30) {
                range2++;
            } else if (age <= 45) {
                range3++;
            } else if (age <= 60) {
                range4++;
            } else {
                range5++;
            }
        }

        perc1 = (range1 * 100f) / NUM;
        perc2 = (range2 * 100f) / NUM;
        perc3 = (range3 * 100f) / NUM;
        perc4 = (range4 * 100f) / NUM;
        perc5 = (range5 * 100f) / NUM;

        System.out.printf("\nAté 15 anos       %d (%.2f%%)", range1, perc1);
        System.out.printf("\n16 a 30 anos      %d (%.2f%%)", range2, perc2);
        System.out.printf("\n31 a 45 anos      %d (%.2f%%)", range3, perc3);
        System.out.printf("\n46 a 60 anos      %d (%.2f%%)", range4, perc4);
        System.out.printf("\nMais que 60 anos  %d (%.2f%%)\n\n", range5, perc5);

        sc.close();
    }
}
