/*
64) Faça um algoritmo que calcule a multiplicação de dois números inteiros sem utilizar o operador “*”. Em vez disso, utilize apenas o operador de adição “+”. Para implementar esse algoritmo, devemos lembrar que qualquer multiplicação pode ser expressa por meio de somas. Por exemplo, o resultado da expressão 6 * 3 é o mesmo que 6 + 6 + 6 ou 3 + 3 + 3 + 3 + 3 + 3. Ou seja, soma-se um elemento com ele próprio o número de vezes do segundo elemento.
*/
/*
Computador só sabe somar e subtrair
A multiplicação é implementada através de repetidas
somas, e a divisão através de repetidas subtrações
*/

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        int multiplicand, multiplier, product = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Multiplicando: ");
        multiplicand = sc.nextInt();

        System.out.print("Multiplicador: ");
        multiplier = sc.nextInt();

        System.out.printf("\n%d x %d = ", multiplicand, multiplier);

        for (int i = 0; i < multiplier; i++) {
            product += multiplicand;
            System.out.printf("%d %s", multiplicand, i < multiplier - 1 ? "+ " : "");
        }

        if (multiplicand != multiplier) {
            System.out.print("/ ");
            for (int i = 0; i < multiplicand; i++) {
                System.out.printf("%d %c ", multiplier, i < multiplicand - 1 ? '+' : '=');
            }
        } else {
            System.out.print("= ");
        }

        System.out.printf("%d.\n\n", product);

        sc.close();
    }
}
