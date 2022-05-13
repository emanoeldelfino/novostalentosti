import java.util.Scanner;

public class ExemploBlocoRepeticao {
    public static void main(String[] args) {
        int counter = 0;
        while (counter <= 10) {
            System.out.println("Rodando... " + counter);

            // Operador de Incremento Pós Fixado
            // contador = contador + 1
            // contador += 1
            counter++; 
        }

        // todo programa que fica rodando até você mandar parar
        // significa que o mesmo de alguma forma implementa
        // um bloco de repetição

        // Operador   incremento    decremento
        // pós-fixado    i++           i--
        // pré-fixado    ++i           --i

        counter = 10;

        while (counter >= 0) {
            System.out.println("Rodando... " + counter);
            
            --counter;
        }

        int answer = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Sim, vou entrar ao menos uma vez.");
            System.out.print("Digite o número 5: ");
            answer = Integer.parseInt(input.nextLine());

            if (answer != 5) {
                // if (answer != 5) continue; // - pula a repetição atual do bloco e continue
                System.out.println("Valor inválido!");
                // break; // - quebra o bloco de repetição mais próximo
            }
        } while (answer != 5);
        // counter = counter + 2
        // counter += 2
        
        for (int i = 0; i < 5; i++) {
            System.out.println("FOR " + i);
        }

        input.close();
    }
}
