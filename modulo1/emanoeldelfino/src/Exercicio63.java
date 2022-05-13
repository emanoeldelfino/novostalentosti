/*
63) Faça um programa que receba 'vários números, calcule e mostre:
- a soma dos números digitados;
- a quantidade de números digitados;
- a média dos números digitados; 
- o maior número digitado;
- o menor número digitado;
- a média dos números pares;
- a porcentagem dos números ímpares entre todos os números digitados.
Finalize a entrada de dados com a digitação do número 30000.
*/

import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        int number, sum = 0, count = 0, largest = 0, smallest = 0, sumEven = 0, countEven = 0, countOdd = 0;
        float mean, meanEven, percOdd;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um número diferente de 30.000: ");
            number = sc.nextInt();

            if (number == 30_000) break;

            if (count == 0) largest = smallest = number;

            if (number > largest) largest = number;

            if (number < smallest) smallest = number;

            if (number % 2 == 0) {
                sumEven += number;
                countEven++;
            } else {
                countOdd++;
            }

            sum += number;
            count++;
        } while (number != 30_000);

        //   c   -  %
        // count - 100%
        // countOdd - percOdd
        // count * percOdd = countOdd * 100
        // percOdd = (countOdd * 100) / count

        mean = (float)sum / (float)count;
        meanEven = (float)sumEven / (float)countEven;
        percOdd = (countOdd * 100f) / (float)count;

        System.out.printf("\nA soma dos números digitados é %d.", sum);
        System.out.printf("\nA quantidade de números digitados é %d.", count);
        System.out.printf("\nA média dos números digitados é %.1f.", mean);
        System.out.printf("\nO maior número digitado é %d.", largest);
        System.out.printf("\nO menor número digitado é %d.", smallest);
        System.out.printf("\nA média dos números pares é %.1f.", meanEven);
        System.out.printf("\nA porcentagem dos números ímpares entre todos os números digitados é %.1f%%.", percOdd);

        sc.close();
    }
}
