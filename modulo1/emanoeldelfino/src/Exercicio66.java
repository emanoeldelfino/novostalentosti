import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        int range1, range2, sumOdd = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1 para faixa de valores: ");
        range1 = sc.nextInt();

        System.out.print("Número 2 para faixa de valores: ");
        range2 = sc.nextInt();

        System.out.printf("\nSoma dos ímpares na faixa de valores (%d ... %d) => ", range1, range2);
        if (range1 < range2) {
            if (range1 % 2 == 0) range1++;
            if (range2 % 2 == 0) range2--;

            for (int num = range1; num <= range2; num += 2) {
                System.out.printf("%d %c ", num, num < range2 ? '+' : '=');
                sumOdd += num;
            }
        } else {
            if (range1 % 2 == 0) range1--;
            if (range2 % 2 == 0) range2++;

            for (int num = range1; num >= range2; num -= 2) {
                System.out.printf("%d %c ", num, num > range2 ? '+' : '=');
                sumOdd += num;
            }
        }

        System.out.printf("%d\n\n", sumOdd);

        sc.close();
    }
}
