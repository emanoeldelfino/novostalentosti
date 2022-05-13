import java.util.Scanner;

public class ExemploDecisao {
    public static void main(String[] args) {
        int numero = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = Integer.parseInt(leitor.nextLine());
        /*
        if (condição/TESTE) {
            // bloco de código (ENTÃO - VERDADEIRO)
        } else {
            // bloco de código (SENÃO - FALSO)
        }

        if (condição/TESTE) {
            // bloco de código (ENTÃO - VERDADEIRO)
        }
        */

        System.out.printf("\nO número é %s que DEZ.\n", (numero > 10 ? "maior" : "menor"));

        // if (numero >= 10) {
        //     System.out.println("O número é maior que DEZ.");
        // } else {
        //     System.out.println("O número é menor que DEZ.");
        // }

        leitor.close();
    }
}
