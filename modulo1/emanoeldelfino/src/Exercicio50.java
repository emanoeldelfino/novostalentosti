/*
50)Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Escreva um programa que solicite a quantidade de votos de cada candidato, a quantidade de votos nulos e votos em branco. Calcule o percentual DE CADA CANDIDATO em relação ao total de votos válidos. E o percentual de votos nulos e votos em branco do total geral de votos.
*/

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        int aVotes, bVotes, cVotes, blank, spoiled, validVotes, invalidVotes, allVotes;
        float aPerc, bPerc, cPerc, invalidPerc, validVotesDec;

        Scanner sc = new Scanner(System.in);

        System.out.print("Votos A: ");
        aVotes = sc.nextInt();
        if (aVotes < 0) {
            System.out.println("Quantidade de votos em A inválida!");
        }

        System.out.print("Votos B: ");
        bVotes = sc.nextInt();
        if (bVotes < 0) {
            System.exit(1);
            System.out.println("Quantidade de votos em B inválida!");
        }

        System.out.print("Votos C: ");
        cVotes = sc.nextInt();
        if (cVotes < 0) {
            System.exit(1);
            System.out.println("Quantidade de votos em C inválida!");
        }

        System.out.print("Votos em Branco: ");
        blank = sc.nextInt();
        if (blank < 0) {
            System.exit(1);
            System.out.println("Quantidade de votos em Branco inválida!");
        }

        System.out.print("Votos Nulos: ");
        spoiled = sc.nextInt();
        if (spoiled < 0) {
            System.exit(1);
            System.out.println("Quantidade de votos Nulos inválida!");
        }

        validVotes = aVotes + bVotes + cVotes;
        invalidVotes = blank + spoiled;
        allVotes = validVotes + invalidVotes;

        //    votes      %
        // validVotes - 100
        //   xVotes   -  xPerc
        // validVotes * xPerc = xVotes * 100
        // xPerc = (xVotes * 100) / validVotes

        // aPerc = (aVotes * 100f) / (float)validVotes;
        // bPerc = (bVotes * 100f) / (float)validVotes;
        // cPerc = (cVotes * 100f) / (float)validVotes;

        validVotesDec = 100f / (float)validVotes;
        aPerc = (float)aVotes * validVotesDec;
        bPerc = (float)bVotes * validVotesDec;
        cPerc = (float)cVotes * validVotesDec;

        invalidPerc = (float)invalidVotes * (100f / (float)allVotes);

        System.out.printf("\nTotal de votos: %d.", allVotes);
        System.out.printf("\nVotos válidos: %d.", validVotes);
        System.out.printf("\nVotos inválidos (brancos e nulos): %d.\n\n", invalidVotes);

        System.out.printf("Percentual de votos de A (votos válidos): %.2f%%", aPerc);
        System.out.printf("\nPercentual de votos de B (votos válidos): %.2f%%", bPerc);
        System.out.printf("\nPercentual de votos de C (votos válidos): %.2f%%", cPerc);
        System.out.printf("\nPercentual de votos nulos e brancos (total de votos): %.2f%%\n\n", invalidPerc);

        sc.close();
    }
}
