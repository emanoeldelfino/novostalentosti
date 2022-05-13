import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        int courseType;
        float courseExpense, discount = 0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("+--------+---------------+");
        System.out.println("| Código |     Curso     |");
        System.out.println("+--------+---------------+");
        System.out.println("|   1    |    Inglês     |");
        System.out.println("|   2    |   Espanhol    |");
        System.out.println("|   3    |   Graduação   |");
        System.out.println("+--------+---------------+");
        System.out.print("Código do curso: ");
        courseType = sc.nextInt();
        if (courseType < 1 || courseType > 3) {
            System.out.println("\nInválido!\n");
            System.exit(1);
        }

        System.out.print("Mensalidade do curso: R$ ");
        courseExpense = Float.parseFloat(sc.nextLine().replace(",", "."));

        switch(courseType) {
            case 1: case 2:
                discount = courseExpense * .4f;
                if (discount > 200)
                    discount = 200f;
            break;

            case 3:
                discount = courseExpense * .55f;
                if (discount > 300)
                    discount = 300f;
            break;
        }

        System.out.printf("\nValor da bolsa de estudos: R$ %.2f.\n\n", discount);

        sc.close();
    }
}
