import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        final float grade1, grade2, grade3, mean, examGrade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        grade1 = Float.parseFloat(sc.nextLine().replace(",", "."));
        
        System.out.print("Nota 2: ");
        grade2 = Float.parseFloat(sc.nextLine().replace(",", "."));

        System.out.print("Nota 3: ");
        grade3 = Float.parseFloat(sc.nextLine().replace(",", "."));

        mean = (grade1 + grade2 + grade3) / 3f;

        System.out.printf("\nMédia: %.2f\n", mean);

        // Operador E "preguiçoso" &
        // Operador E &&
        // Operador OU ||

        if (mean >= 7) {
            System.out.println("Passou");
        } else if (mean >= 3) {
            examGrade = 10 - mean;
            System.out.println("Em exame");
            System.out.printf("Nota para passar -> %.2f", examGrade);
        }
        else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
