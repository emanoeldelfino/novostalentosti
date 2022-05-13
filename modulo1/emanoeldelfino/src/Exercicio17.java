import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        float salary, account1, account2, accountsTotal, remainSalary;

        Scanner sc = new Scanner(System.in);

        System.out.print("Salário: R$ ");
        salary = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Valor da primeira conta: R$ ");
        account1 = Float.parseFloat(sc.nextLine().replace(",", "."));
        System.out.print("Valor da segunda conta: R$ ");
        account2 = Float.parseFloat(sc.nextLine().replace(",", "."));

        accountsTotal = ((account1 * 1.02f) + (account2 * 1.02f));

        remainSalary = (salary - accountsTotal);

        System.out.printf("\nValor total das contas com multa do atraso: R$ %.2f.\n", accountsTotal);
        System.out.printf("Salário restante: R$ %.2f.\n\n", remainSalary);
        sc.close();
    }
}
