import java.util.Scanner;

public class Exercicio67 {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para ver sua tabuada: ");
        number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n%d x %2d = %d", number, i, number * i);
        }

        sc.close();
    }
}
