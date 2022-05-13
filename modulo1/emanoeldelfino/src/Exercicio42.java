/*
42) Escreva um algoritmo que calcule o valor da multa (em UFIR) que um motorista deve receber de acordo com a velocidade de seu carro. Acima de 60km/h e ate 100km/h multa media 60 UFIR, acima de 100 km/h até 160km/h grave 120 UFIR, e acima de 160km/h gravíssima 180 UFIR.
*/

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        float speedKmH;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade do carro (km/h): ");
        speedKmH = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (speedKmH < 60) {
            System.out.println("Nenhuma multa aplicada.");
        } else if (speedKmH <= 100) {
            System.out.println("Multa média 60 UFIR.");
        } else if (speedKmH <= 160) {
            System.out.println("Multa grave 120 UFIR.");
        } else {
            System.out.println("Multa gravíssima 180 UFIR.");
        }

        sc.close();
    }
}
