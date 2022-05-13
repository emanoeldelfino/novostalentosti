import java.util.Arrays;
import java.util.Scanner;

public class ExemploEstruturaDeDados {
    public static void main(String[] args) {
        // ESTRUTURA DE DADOS
        
        // Variáveis com dados simples: armazenam apenas um valor.
        // int age = 10;
        // float salary = 1200f;
        // boolean isItGoingToRain = true;


        // Variáveis estruturadas - Array/Vetor/Lista
        String[] namesList = new String[10];
        namesList[0] = "Zézinho";
        namesList[9] = "Mariazinha";

        System.out.println(namesList[0]);
        //namesList[0] = null;
        //System.out.println(namesList[0]);
        System.out.println(namesList[9]);

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < namesList.length; i++) {
            System.out.printf("\nnamesList[%d] = %s", i, namesList[i]);
        }

        System.out.println();

        for (int i = 0; i < namesList.length; i++) {
            System.out.print("Digite um nome: ");
            namesList[i] = input.nextLine();
        }

        System.out.println();

        System.out.println(Arrays.toString(namesList));

        input.close();
    }
}
