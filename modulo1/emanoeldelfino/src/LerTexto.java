import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LerTexto {
    public static void main(String[] args) {
        try {
            // Scanner sc = new Scanner(new File("./src/texto.txt"));
            Scanner sc = new Scanner(new File("./src/arquivo.csv"));

            while (sc.hasNext()) {
                //     System.out.println(sc.nextLine());
                for (String value: sc.nextLine().split(";")) {
                    System.out.println(value);
                }
            }

            sc.close();
        } catch (FileNotFoundException err) {
            err.printStackTrace();
        }
    }
}
