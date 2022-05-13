import java.util.Scanner;

public class Exercicio82 {
    static final int QUESTIONS = 10;
    static final int STUDENTS = 15;
    public static void main(String[] args) {
        int[] testAnswers = new int[QUESTIONS];
        int[] numStudents = new int[STUDENTS];
        float[] studentGrades = new float[STUDENTS];
        int approvedNum = 0, testAnswer, studentAnswer, correctAnswers;
        float approvedPerc;
        boolean foundStudent;

        Scanner sc = new Scanner(System.in);

        // Ler o gabarito
        System.out.println("========================");
        System.out.println("|       Gabarito       |");
        System.out.println("========================\n");
        for (int i = 0; i < QUESTIONS; i++) {
            do {
                System.out.printf("Resposta da questão %d: ", i + 1);
                testAnswer = Integer.parseInt(sc.nextLine());

                if (testAnswer < 0) {
                    System.out.println("Resposta negativa inválida para questão de somatória.");
                }
            } while (testAnswer < 0);

            testAnswers[i] = testAnswer;
        }

        System.out.println("\n=======================");
        System.out.println("| Resposta dos Alunos |");
        System.out.println("=======================");
        for (int i = 0; i < STUDENTS; i++) {
            correctAnswers = 0;

            do {
                foundStudent = false;
                System.out.printf("\nNúmero do aluno %d: ", i + 1);
                numStudents[i] = Integer.parseInt(sc.nextLine());

                for (int j = 0; j < i; j++) {
                    if (numStudents[i] == numStudents[j]) {
                        foundStudent = true;
                        System.out.printf("A nota do aluno de número %d já foi registrada. Tente novamente!\n", numStudents[i]);
                    };
                }
            } while (foundStudent);

            // Ler as respostas do aluno
            for (int j = 0; j < QUESTIONS; j++) {
                do {
                    System.out.printf("Resposta do aluno %d de número %d para questão %d: ", i + 1, numStudents[i], j + 1);
                    studentAnswer = Integer.parseInt(sc.nextLine());

                    if (studentAnswer < 0) {
                        System.out.println("Resposta negativa inválida para questão de somatória.");
                    }
                } while (studentAnswer < 0);

                if (studentAnswer == testAnswers[j]) {
                    correctAnswers++;
                }
            }

            studentGrades[i] = (correctAnswers * 10f) / (float)QUESTIONS;

            if (studentGrades[i] >= 6) approvedNum++;
        }

        approvedPerc = (approvedNum * 100f) / STUDENTS;

        System.out.println("\n===================================");
        System.out.printf("| %10s |   %6s   | %5s |\n", "Estudante", "Número", "Nota");
        System.out.println("===================================");
        for (int i = 0; i < STUDENTS; i++) {
            System.out.printf("|     %2d     |    %2d    | %5.2f |\n", i + 1, numStudents[i], studentGrades[i]);
        }
        System.out.println("===================================");
        System.out.printf("\nPorcentagem de aprovação (mínimo 6): %.2f%%.\n\n", approvedPerc);

        sc.close();
    }
}
