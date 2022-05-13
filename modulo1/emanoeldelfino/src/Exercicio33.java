import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        int productCode, countryCode, tax = 0;
        float productWeightKg, productWeightG, pricePerGram = 0f, grossPrice, taxValue, totalPrice;

        Scanner sc = new Scanner(System.in);

        System.out.print("Código do produto (1 a 10): ");
        productCode = Integer.parseInt(sc.nextLine());

        if (productCode < 1 || productCode > 10) {
            System.out.println("\nCódigo de produto inválido.\n");
            System.exit(1);
        } else if (productCode <= 4) {
            pricePerGram = 10f;
        } else if (productCode <= 7) {
            pricePerGram = 25f;
        } else {
            pricePerGram = 35f;
        }

        System.out.print("Peso do produto (kg): ");
        productWeightKg = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (productWeightKg <= 0) {
            System.out.println("\nPeso do produto inválido.\n");
            System.exit(1);
        }

        System.out.print("Código do país de origem (1 a 3): ");
        countryCode = Integer.parseInt(sc.nextLine());

        switch (countryCode) {
            case 1:
                tax = 0;
            break;
                
            case 2:
                tax = 15;
            break;

            case 3:
                tax = 25;
            break;

            default:
                System.out.println("\nCódigo do país inválido.\n");
                System.exit(1);
        }

        productWeightG = productWeightKg * 1000f;
        grossPrice = productWeightG * pricePerGram;
        taxValue = grossPrice * ((float)tax / 100f);
        totalPrice = grossPrice + taxValue;

        System.out.printf("\nPeso do produto em gramas: %.2f g", productWeightG);
        System.out.printf("\nPreço bruto do produto: R$ %.2f", grossPrice);
        System.out.printf("\nValor do imposto: R$ %.2f", taxValue);
        System.out.printf("\nPreço total do produto: R$ %.2f", totalPrice);

        sc.close();
    }
}
