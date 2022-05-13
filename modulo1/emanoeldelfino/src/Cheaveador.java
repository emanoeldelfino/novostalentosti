import java.io.IOException;

public class Cheaveador {
    public static void main(String[] args) throws IOException, InterruptedException {
        int option = 10; 

        if (option == 0) {
            // entao - sim - verdadeiro
            System.out.println("IF: Valor ZERO");
        } else {
            // senao - nao - falso
            if (option == 1) {
                System.out.println("IF: Valor é um");
            } else {
                if (option == -1) {
                    System.out.println("IF: Valor negativo");
                }
            }
        }

        // chamado de CHAVEADOR, pois chaveia cada opção
        // os default, bem como os casos podem estar em qualquer
        // ordem dentro do switch
        // Switch executa os próximos casos até encontrar o break
        switch (option) {
            // sobrecarga (múltiplas opções)
            case -1: case -2: case -3: case -4: case -5:
                System.out.println("SWITCH: valor negativo");
            break;
            
            case 0:
                System.out.println("SWITCH: valor ZERO");
            break;

            case 1:
                System.out.println("SWITCH: valor é um");
            break;

            default:
                System.out.println("Nenhum dos casos anteriores!");
            break;
        }
    }
}
