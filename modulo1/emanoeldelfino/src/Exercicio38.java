import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        float productPrice = 0f;
        int originCode = 0;
        String origin = "";

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Preço do produto: R$ ");
        productPrice = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.print("Código de origem: ");
        originCode = sc.nextInt();

        if (originCode < 0 || originCode > 30) {
            origin = "Inválido";
        } else if (originCode == 1) {
            origin = "Sul";
        } else if (originCode == 2) {
            origin = "Norte";
        } else if (originCode == 3) {
            origin = "Leste";
        } else if (originCode == 4) {
            origin = "Oeste";
        } else if (originCode <= 6) {
            origin = "Noroeste";
        } else if (originCode <= 9) {
            origin = "Sudeste";
        } else if (originCode <= 20) {
            origin = "Centro-Oeste";
        } else {
            origin = "Nordeste";
        }

        System.out.printf("\nProcedência do produto de R$ %.2f: %s.\n\n", productPrice, origin);

        sc.close();
    }
}
