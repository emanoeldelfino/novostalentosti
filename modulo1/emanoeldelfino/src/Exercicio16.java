import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        final float minSalary, employeeSalary, numMinSalaries;

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do salário mínimo: R$ ");
        minSalary = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.print("Valor do salário do funcionário: R$ ");
        employeeSalary = Float.parseFloat(sc.nextLine().replace(",", "."));

        numMinSalaries = (employeeSalary / minSalary);  

        System.out.printf("\nO funcionário ganha %.2f salário(s) mínimo(s).\n\n", numMinSalaries);
        
        sc.close();
    }
}
