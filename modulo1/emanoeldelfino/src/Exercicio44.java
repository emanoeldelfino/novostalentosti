/*
44)Escreva um algoritmo que calcule o valor de uma chamada de telefone. Deverá ser informado a quantidade de minutos falados durante a ligação além de sua origem. Considere que uma ligação “local” custa R$0.020, ligação “intermunicipal” R$0,08 e “interestadual” R$0,1.
*/

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        float callPrice = 0;
        int option, spokenMins;

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("| 1 - Local           |");
        System.out.println("| 2 - Intermunicipal  | ");
        System.out.println("| 3 - Interestadual   |");
        System.out.println("=======================");
        System.out.print("Tipo de ligação: ");
        option = sc.nextInt();

        if (option >= 1 && option <= 3) {
            System.out.print("Quantidade de minutos falados: ");
            spokenMins = sc.nextInt();

            switch (option) {
                case 1:
                    callPrice = spokenMins * .02f;
                break;

                case 2:
                    callPrice = spokenMins * .08f;
                break;

                case 3:
                    callPrice = spokenMins * .1f;
            }
            System.out.printf("\nO valor da chamada é de R$ %.2f.\n", callPrice);
        } else {
            System.out.println("\nOpção inválida.\n");
        }

        sc.close();
    }
}
