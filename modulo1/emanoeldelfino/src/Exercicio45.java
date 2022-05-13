/*
45)Escreva um algoritmo que calcule o valor de desconto que será oferecido ao comprador de uma loja de acordo com o valor da compra: compras até R$100 desconto de 5%, compras maiores que R$ 100 e ate R$400 desconto de 10%, e acima de R$ 400 desconto de 13%. Após o calculo do valor com desconto, acrescente o valor da taxa de entrega que é de R$ 1,5 por item comprado.
*/

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        float value, discount, numItems, valueDiscount, deliveryFee, finalValue;

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        value = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (value < 0) {
            System.out.print("\nInválido!");
        } else {
            if (value <= 100) {
                discount = 5;
            } else if (value <= 400) {
                discount = 10;
            } else {
                discount = 13;
            }
            System.out.print("Número de itens comprados: ");
            numItems = sc.nextInt();

            if (numItems < 0) {
                System.out.print("\nInválido!");
            } else {
                valueDiscount = value * (discount / 100f);
                deliveryFee = numItems * 1.5f;
                finalValue = value - valueDiscount + deliveryFee;
                
                System.out.printf("\nValor do desconto: R$ %.2f", valueDiscount);
                System.out.printf("\nValor da taxa de entrega: R$ %.2f", deliveryFee);
                System.out.printf("\nValor final da compra: R$ %.2f", finalValue);
            }
        }

        System.out.println("\n");

        sc.close();
    }
}
