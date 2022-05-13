import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        String name;
        float grossSalary, netSalary, serviceYears, tax, taxValue = 0f, bonusValue, foodAssistPerc, foodAssistVal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        name = sc.nextLine();

        System.out.print("Salário: ");
        grossSalary = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (grossSalary < 0) {
            System.out.println("Inválido!");
            System.exit(1);
        }

        System.out.print("Tempo de serviço (anos): ");
        serviceYears = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (serviceYears < 0) {
            System.out.println("Inválido!");
            System.exit(1);
        }

        if (grossSalary <= 200) {
            System.out.print("\nImposto isento sobre o salário.");
            taxValue = 0f;
        } else {
            if (grossSalary <= 450) {
                tax = 3;
            } else if (grossSalary < 700) {
                tax = 8;
            } else if (grossSalary == 700) {
                tax = 10;
            } else {
                tax = 12;
            }

            taxValue = grossSalary * (tax / 100f);

            System.out.printf("\nImposto de R$ %.2f sobre o salário-base de R$ %.2f.", taxValue, grossSalary);
        }

        if (grossSalary <= 500) {
            if (serviceYears <= 3) {
                bonusValue = (grossSalary * .05f) + 23f;
            } else if (serviceYears < 6) {
                bonusValue = (grossSalary * .06f) + 35f;
            } else {
                bonusValue = (grossSalary * .1f) + 33f;
            }
        } else {
            if (serviceYears <= 3) {
                bonusValue = (grossSalary * .02f) + 50f;
            } else {
                bonusValue = (grossSalary * .03f) + 60f;
            }
        }
        System.out.printf("\nGratificação de R$ %.2f.", bonusValue);

        if (serviceYears <= 10) {
            foodAssistPerc = 4;
        } else {
            foodAssistPerc = 6;
        }
        foodAssistVal = grossSalary * (foodAssistPerc / 100f);

        System.out.printf("\nAuxílio alimentação de R$ %.2f.", foodAssistVal);

        netSalary = (grossSalary - taxValue) + bonusValue + foodAssistVal;

        System.out.printf("\n\nO salário líquido de %s é de R$ %.2f.\n\n", name, netSalary);

        sc.close();
    }
}
