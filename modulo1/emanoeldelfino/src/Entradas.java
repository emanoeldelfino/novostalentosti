import java.util.Scanner;

public class Entradas {
    // Deve escrever dentro das chaves
    public static void main(String[] args) {
        System.out.print("Querido usuário, digite seu nome: ");

        Scanner sc = new Scanner(System.in);
        // Scanner é um tipo objeto, já que começa com maiúscula
        // Ele consegue ler vários tipos de dados
        // System.in é a entrada do teclado, o que é digitado

        String nome = sc.nextLine();
        System.out.println("Seu nome é " + nome);

        sc.close();
    }
}
