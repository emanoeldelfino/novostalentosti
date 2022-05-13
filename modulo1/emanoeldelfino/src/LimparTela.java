import java.io.IOException;
import java.util.Scanner;

public class LimparTela {

    static void clear() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
    }
    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");

        clear();

        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.printf("A soma entre %d e %d é %d.\n\n", num1, num2, sum);

        sc.close();
    }
}
