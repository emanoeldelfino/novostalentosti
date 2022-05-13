import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        final float sqrSideCm, sqrArea;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado do quadrado (cm): ");
        sqrSideCm = Float.parseFloat(sc.nextLine().replace(",", "."));

        sqrArea = sqrSideCm * sqrSideCm;

        System.out.println(String.format("\nA área do quadrado é de %.2f cm².\n", sqrArea));

        sc.close();
    }
}
