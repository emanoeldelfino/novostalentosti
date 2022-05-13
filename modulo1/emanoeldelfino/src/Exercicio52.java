import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        float productPrice, avgMonthlySale, newPrice = 0f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Preço do produto: R$ ");
        productPrice = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (productPrice < 0) {
            System.out.printf("Valor menor que zero inválido: %.2f", productPrice);
            System.exit(1);
        }

        System.out.print("Venda média mensal: R$ ");
        avgMonthlySale = Float.parseFloat(sc.nextLine().replace(",", "."));
        
        if (avgMonthlySale < 0) {
            System.out.printf("Valor menor que zero inválido: %.2f", avgMonthlySale);
            System.exit(1);
        }

        if (avgMonthlySale < 500) {
            if (productPrice < 30) {
                newPrice = productPrice * 1.12f;
            }
        } else if (avgMonthlySale < 1_600) {
            if (productPrice >= 30 && productPrice < 80) {
                newPrice = productPrice * 1.15f;
            }
        } else if (productPrice > 80) {
            newPrice = productPrice * .75f;
        }

        if (newPrice == 0) {
            System.out.println("\nNão houve alteração no preço do produto.\n");
        } else {
            System.out.printf("\nO preço do produto foi alterado de R$ %.2f para R$ %.2f.\n\n", productPrice, newPrice);
        }

        sc.close();
    }
}
