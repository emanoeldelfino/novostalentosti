import java.util.Scanner;

public class Exercicio74x {
    public static void main(String[] args) {
        float minWage, spentKw, kwVal, percAdd = 0f, valAdd, consGrossBill, consBill, billings = 0f;
        int consumerType, count = 1, consSpent500to1000 = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor do salário mínimo: R$ ");
        minWage = Float.parseFloat(sc.nextLine().replace(",", "."));

        // kwVal = minWage * (1f / 8f);
        kwVal = minWage * .125f;

        System.out.printf("\nO valor por Kw é de R$ %.2f.\n\n", kwVal);

        do {
            System.out.printf("Kw gasto pelo consumidor %d (negativo ou zero para parar): ", count);
            spentKw = Float.parseFloat(sc.nextLine().replace(",", "."));
            // spentKw = sc.nextFloat();

            if (spentKw > 0) {
                do {
                    System.out.println("1 - Residencial;");
                    System.out.println("2 - Comercial;");
                    System.out.println("3 - Industrial.");
                    System.out.print("Tipo de consumidor: ");
                    consumerType = Integer.parseInt(sc.nextLine());
                } while (consumerType < 1 || consumerType > 3);
    
                switch (consumerType) {
                    case 1:
                        percAdd = 5;
                    break;

                    case 2:
                        percAdd = 10;
                    break;
                        
                    case 3:
                        percAdd = 15;
                    break;
                }

                consGrossBill = spentKw * kwVal;

                valAdd = consGrossBill * ((float)percAdd / 100f);

                consBill = consGrossBill + valAdd;

                System.out.printf("\nValor a ser pago pelo consumidor %d: R$ %.2f.\n\n", count, consBill);
    
                billings += consBill;

                if (consBill >= 500 && consBill <= 1000) {
                    consSpent500to1000++;
                }

                count++;
            }
        } while (spentKw > 0);

        System.out.printf("\nO total de cobranças (possível futuro faturamento) da empresa é R$ %.2f.", billings);
        System.out.printf("\nO número de consumidores que gastaram entre R$ 500,00 a R$ 1000,00 é %d.\n\n", consSpent500to1000);

        sc.close();
    }
}
