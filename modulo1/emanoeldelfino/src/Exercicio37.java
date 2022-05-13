/*
37)Faça um programa que receba o código correspondente ao cargo 
de um funcionário e seu salário atual e mostre o cargo, o valor 
do aumento e seu novo salário. Os cargos estão na seguinte 
tabela:
 
Código    Cargo            Percentual
1         Escriturário      50%
2         Secretário        35%
3         Caixa             20%
4         Gerente           10%
5         Diretor           Não tem aumento
*/

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        int roleCode;
        float salary, percRaise = 0f, raise, newSalary;
        String role = "";

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Código do cargo: ");
        roleCode = sc.nextInt();

        if (roleCode >= 1 && roleCode <= 5) {
            System.out.print("Salário: R$ ");
            salary = Float.parseFloat(sc.nextLine().replace(",", "."));
            
            switch (roleCode) {
                case 1:
                    role = "Escrituário";
                    percRaise = 50f;
                break;

                case 2:
                    role = "Secretário";
                    percRaise = 35f;
                break;

                case 3:
                    role = "Caixa";
                    percRaise = 20f;
                break;

                case 4:
                    role = "Gerente";
                    percRaise = 10f;
                break;

                case 5:
                    role = "Diretor";
                    percRaise = 0f;
                break;
            }

            raise = salary * (percRaise / 100);
            newSalary = salary + raise;
            System.out.printf("\nCargo: %s", role);
            if (roleCode != 5) {
                System.out.printf("\nAumento: R$ %.2f", raise);
                System.out.printf("\nNovo salário: R$ %.2f", newSalary);                    
            } else {
                System.out.println("\nNão tem aumento");
            }
        } else {
            System.out.println("Código inválido!");
        }

        System.out.println();

        sc.close();
    }
}
