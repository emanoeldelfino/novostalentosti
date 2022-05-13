/*
46)Construa um algoritmo que calcule o consumo de combustível de um veículo qualquer baseado nas informações de quilometragem  inicial e final de um percurso, e a quantidade de gasolina consumida em litros. Caso o consumo esteja entre 10 e 16 litros/km mostre a mensagem “consumo normal”, caso seja maior que 16 litros/km apresente a mensagem “consumo anormal”.
*/

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        float initialKm, finalKm, totalKm = 0f, fuelConsumeL = 0f, fuelConsumeLPKm = 0f, fuelConsumeKmPL = 0f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quilometragem inicial: ");
        initialKm = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.print("Quilometragem final: ");
        finalKm = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (initialKm < finalKm) {
            System.out.print("Consumo de gasolina (litros): ");
            fuelConsumeL = Float.parseFloat(sc.nextLine().replace(",", "."));
            
            if (fuelConsumeL < 0) {
                System.out.println("Entrada negativa inválida!");
            } else {
                totalKm = finalKm - initialKm;

                fuelConsumeLPKm = fuelConsumeL / totalKm;
                fuelConsumeKmPL = totalKm / fuelConsumeL;
    
                System.out.printf("\nConsumo de gasolina: %.2f litros/km.", fuelConsumeLPKm);
                System.out.printf("\nConsumo de gasolina: %.2f km/l.\n\n", fuelConsumeKmPL);

                if (fuelConsumeLPKm >= 10 && fuelConsumeLPKm <= 16) {
                    System.out.println("Consumo normal");
                } else if (fuelConsumeLPKm > 16) {
                    System.out.println("Consumo anormal");
                } else {
                    System.out.println("Outro consumo");
                }

                System.out.println();
            }
        } else {
            System.out.println("\nQuilometragem inicial/final inválida!\n");
        }

        sc.close();
    }
}
