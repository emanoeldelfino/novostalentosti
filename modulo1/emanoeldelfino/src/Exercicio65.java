import java.math.BigInteger;
import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        int number, term;
        BigInteger fact = BigInteger.ONE; // BigInteger.valueOf(1)

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Número: ");
            number = sc.nextInt();
            if (number < 0) {
                System.out.println("Número inválido!");
            }
        } while (number < 0);

        // for (int i = number; i >= 1; i--) {
        //     fact = fact.multiply(BigInteger.valueOf(i));
        // }

        for (int i = 0; (number - i) > 0; i++) {
            term = number - i;
            System.out.printf("%d (%d - %d) %c ", term, number, i, (term) > 1 ? 'x' : '=');
            fact = fact.multiply(BigInteger.valueOf(term));
        }

        System.out.printf("%d.\n\n", fact);

        sc.close();
    }
}
