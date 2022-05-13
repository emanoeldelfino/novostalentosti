/*
40)Escreva um algoritmo que solicite a quantidade total em miligramas de colesterol mau existente no sangue de um paciente. Considerando que o valor máximo ideal para uma pessoa saudável é 130mg, caso a quantidade esteja menor apresente uma mensagem indicando que esta menor. Caso esteja acima, calcule o percentual que esta acima e apresente uma mensagem.
*/

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        float badCholesterolMg;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de colesterol mau no sangue (mg): ");
        badCholesterolMg = Float.parseFloat(sc.nextLine().replace(",", "."));

        if (badCholesterolMg <= 130) {
            System.out.println("O nível de colesterol mau está dentro do ideal.");
        } else {
            System.out.println("Colesterol mau acima do ideal.");
            //      qt                %
            //     130             - 100
            //  badCholesterolMg   -  percentAbove
            // percentAbove * 130 = badCholesterolMg * 100;
            // percentAbove = (badCholesterolMg * 100) / 130;
            float percentAbove = ((badCholesterolMg * 100f) / 130f) - 100f;
            System.out.printf("O colesterol está %.2f%% acima do ideal.", percentAbove);
        }

        sc.close();
    }
}
