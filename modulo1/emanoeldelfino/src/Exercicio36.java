/*
36)Pedro comprou um saco de ração com peso em quilos. Pedro 
possui dois gatos para os quais fornece a quantidade de ração em
gramas. Faça um programa que receba o peso do saco de ração e a 
quantidade de ração fornecida para cada gato. Calcule e mostre 
quanto restará de ração no saco após cinco dias.
*/

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        final float catFoodBagKg, foodCat1G, foodCat2G, foodLeft5Days;

        Scanner sc = new Scanner(System.in);

        System.out.print("Peso do saco de ração (kg): ");
        catFoodBagKg = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.print("Quantidade de ração fornecida para o gato 1 (g): ");
        foodCat1G = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.print("Quantidade de ração fornecida para o gato 2 (g): ");
        foodCat2G = Float.parseFloat(sc.nextLine().replace(",", "."));

        foodLeft5Days = catFoodBagKg - (((foodCat1G / 1000f) + (foodCat2G / 1000f)) * 5);

        System.out.printf("Quantidade de ração que restará no saco após 5 dias: %.2f kg.", foodLeft5Days);
        sc.close();
        
    }
}
