import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {
        int numClasses, numStudents;
        float grade = 0f, sumGrades = 0f, classMean = 0f, sumMeans = 0f, generalMean;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Número de turmas: ");
            numClasses = Integer.parseInt(sc.nextLine());    
        } while (numClasses <= 0);

        for (int i = 0; i < numClasses; i++) {
            do {
                System.out.printf("\nNúmero de alunos da turma %d: ", i+1);
                numStudents = Integer.parseInt(sc.nextLine());
            } while (numStudents <= 0);

            sumGrades = 0f;
            for (int j = 0; j < numStudents; j++) {
                do {
                    System.out.printf("Nota do aluno %d da turma %d (0 a 10): ", j+1, i+1);
                    grade = Float.parseFloat(sc.nextLine().replace(",", "."));

                    if (grade < 0 || grade > 10) {
                        System.out.println("Nota inválida. Informe uma nota de 0 a 10, ou converta a mesma para este sistema.");
                    }
                } while (grade < 0 || grade > 10);

                sumGrades += grade;
            }

            classMean = sumGrades / (float)numStudents;

            System.out.printf("\nMédia da turma %d: %.2f.\n", i+1, classMean);

            sumMeans += classMean;
        }

        generalMean = sumMeans / (float)numClasses;

        System.out.printf("\nMédia geral: %.2f.\n\n", generalMean);

        sc.close();
    }
}
