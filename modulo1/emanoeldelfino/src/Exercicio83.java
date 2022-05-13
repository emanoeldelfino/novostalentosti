import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        String[] months = {"Janeiro", "Fevereiro", "Março", 
                            "Abril", "Maio", "Junho",
                            "Julho", "Agosto", "Setembro",
                            "Outubro", "Novembro", "Dezembro"};
        float[] monthsTemp = new float[12];
        float lowestTemp = 0, largestTemp = 0;
        String lowestTempStr = "", largestTempStr = "";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.printf("Temperatura média de %s (%d): ", months[i], i + 1);
            monthsTemp[i] = Float.parseFloat(sc.nextLine().replace(",", "."));

            if (i == 0) {
                lowestTemp = largestTemp = monthsTemp[i];
                lowestTempStr = largestTempStr = months[i];
            } else {
                if (monthsTemp[i] < lowestTemp) {
                    lowestTemp = monthsTemp[i];
                    lowestTempStr = months[i];
                }
                if (monthsTemp[i] > largestTemp) {
                    largestTemp = monthsTemp[i];
                    largestTempStr = months[i];
                }
            }
        }

        System.out.println("\n===========================");
        System.out.println("|    Mês    | Temperatura |");
        System.out.println("===========================");
        for (int i = 0; i < 12; i++) {
            System.out.printf("| %9s |    %4.1f°   |\n", months[i], monthsTemp[i]);
        }
        System.out.println("===========================");

        System.out.printf("\nMenor temperatura foi de %.2f° em %s.", lowestTemp, lowestTempStr);
        System.out.printf("\nMaior temperatura foi de %.2f° em %s.\n\n", largestTemp, largestTempStr);

        sc.close();
    }
}
