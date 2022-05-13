import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        final float weightKg, weightGrams;
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso (kg): ");
        weightKg = Float.parseFloat(sc.nextLine().replace(",", "."));
        weightGrams = (weightKg * 1000.0f);

        System.out.println(String.format("\nO peso em gramas é %.2f g.\n", weightGrams));

        sc.close();
    }
}
