import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        final float price, newPrice;

        Scanner sc = new Scanner(System.in);

        System.out.print("Preço do produto: R$ ");
        price = Float.parseFloat(sc.nextLine().replace(",", "."));
        //novoPreco = preco - (preco * (10 / 100));
        //preco -> 100%
        //novoPreco -> 90%
        //preco * (90 / 100) = 0.9
        newPrice = price * .9f;

        System.out.println(String.format("\nO novo preço do produto é de R$%.2f.\n", newPrice));
        sc.close();
    }
}
