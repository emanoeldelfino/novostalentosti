import java.util.Scanner;

public class Exercicio79 {
    final static int NUM = 2;
    public static void main(String[] args) {
        int[] soldClothes = new int[NUM];
        float[] priceClothes = new float[NUM];
        float[] totalSoldValues = new float[NUM];
        float totalSoldVal = 0f;
        int soldClothesTotal = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NUM; i++) {
            do {
                System.out.printf("\nQuantidade das peças de roupa vendidas pelo vendedor %d: ", i + 1);
                soldClothes[i] = Integer.parseInt(sc.nextLine());
            } while (soldClothes[i] < 0);

            do {
                System.out.print("Preço por peça de roupa vendida: R$ ");
                priceClothes[i] = Float.parseFloat(sc.nextLine().replace(",", "."));
            } while (priceClothes[i] <= 0);

            soldClothesTotal += soldClothes[i];

            totalSoldValues[i] = (float)soldClothes[i] * priceClothes[i];
            totalSoldVal += totalSoldValues[i];
        }

        System.out.println("\n---------------------------------------------");
        System.out.println("| Vendedor | Peças vendidas |  Ganho total  |");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < NUM; i++) {
            System.out.printf("| %5d    |    %5d       |  R$ %8.2f  |\n", i + 1, soldClothes[i], totalSoldValues[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.printf("|  Total   |    %5d       |  R$ %8.2f  |\n", soldClothesTotal, totalSoldVal);
        System.out.println("---------------------------------------------\n\n");
        sc.close();
    }
}
