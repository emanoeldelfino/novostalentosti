import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        final float bigBaseCm, smallBaseCm, heightCm, trapezeAreaCm;

        System.out.println("=".repeat(25));
        System.out.println("| CÁLCULO ÁREA TRAPÉZIO |");
        System.out.println("=".repeat(25));

        Scanner sc = new Scanner(System.in);
        System.out.print("Base menor (cm): ");
        smallBaseCm = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Base maior (cm): ");
        bigBaseCm = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Altura (cm): ");
        heightCm = Float.parseFloat(sc.nextLine().replace(",", "."));

        trapezeAreaCm = (((bigBaseCm + smallBaseCm) * heightCm) / 2.0f);

        System.out.println(String.format("\nÁrea: %.2f cm².\n", trapezeAreaCm));

        sc.close();
    }
}
