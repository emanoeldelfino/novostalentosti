import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        int productTaxOption;
        float priceDollars, exchangeRateReal, transportValReal, priceReals, taxPerc = 0f, federalTaxVal, stateTaxVal, finalPrice;

        Scanner sc = new Scanner(System.in);

        System.out.print("Preço do produto em dólares: U$ ");
        priceDollars = Float.parseFloat(sc.nextLine());
        if (priceDollars < 0) {
            System.exit(1);
            System.out.println("Valor inválido!");
        }

        System.out.print("Cotação do dólar (quanto vale 1 dólar / U$ 1): R$ ");
        exchangeRateReal = Float.parseFloat(sc.nextLine().replace(",", "."));
        if (exchangeRateReal < 0) {
            System.exit(1);
            System.out.println("Valor inválido!");
        }

        System.out.print("Valor do transporte: R$ ");
        transportValReal = Float.parseFloat(sc.nextLine().replace(",", "."));
        if (transportValReal < 0) {
            System.exit(1);
            System.out.println("Valor inválido!");
        }

        System.out.println("\n=================");
        System.out.println("1 - IPI;");
        System.out.println("2 - ICMS;");
        System.out.println("3 - IPI e ICMS.");
        System.out.println("=================");
        System.out.print("Tipo de imposto sobre o produto: ");
        productTaxOption = sc.nextInt();
        if (productTaxOption < 1 || productTaxOption > 3) {
            System.out.println("Inválido!");
            System.exit(1);
        }

        priceReals = priceDollars * exchangeRateReal;

        switch (productTaxOption) {
            case 1:
                if (priceReals <= 3000) {
                    taxPerc = 1.5f;
                } else {
                    taxPerc = 2f;
                }
            break;

            case 2:
                if (priceReals < 1500) {
                    taxPerc = 2f;
                } else {
                    taxPerc = 3.5f;
                }
            break;

            case 3:
                taxPerc = 5f;
            break;
        }

        federalTaxVal = priceReals * (taxPerc / 100f);

        stateTaxVal = federalTaxVal * (2f / 7f);

        finalPrice = priceReals + transportValReal + federalTaxVal + stateTaxVal;

        System.out.printf("\nPreço do produto convertido para Reais: R$ %.2f.", priceReals);
        System.out.printf("\nPorcentagem da taxa do imposto: %.1f%%.", taxPerc);
        System.out.printf("\nValor do imposto federal: R$ %.2f.", federalTaxVal);
        System.out.printf("\nValor do imposto estadual: R$ %.2f.", stateTaxVal);
        System.out.printf("\nPreço final do produto importado: R$ %.2f.\n\n", finalPrice);

        sc.close();
    }
}
