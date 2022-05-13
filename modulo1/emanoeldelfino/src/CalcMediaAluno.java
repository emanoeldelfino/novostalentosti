import java.util.Scanner;

public class CalcMediaAluno {
    public static void main(String[] args) {
        // float nota1 = 0,
        //       nota2 = 0,
        //       nota3 = 0,
        //       nota4 = 0,
        //       media = 0;
        
        // float nota1 = 0,
        // nota2 = 0,
        // nota3 = 0,
        // nota4 = 0;

        // A keyword final torna a variável uma CONSTANTE
        final float nota1, nota2, nota3, nota4;
        float percPresenca = 0;

        // ERRO -> Palavra reservada var só pode ser usada ao atribuir o valor diretamente em sua declaração.
        // final var nota1, nota2, nota3, nota4;

        // VARIÁVEL - TIPO IDENTIFICADOR = VALOR;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nNome do aluno: ");
        String nome = sc.nextLine();

        System.out.print(String.format("Nota 1 do aluno %s: ", nome));
        nota1 = Float.parseFloat(sc.nextLine());
        System.out.print(String.format("Nota 2 do aluno %s: ", nome));
        nota2 = Float.parseFloat(sc.nextLine());
        System.out.print(String.format("Nota 3 do aluno %s: ", nome));
        nota3 = Float.parseFloat(sc.nextLine());
        System.out.print(String.format("Nota 4 do aluno %s: ", nome));
        nota4 = Float.parseFloat(sc.nextLine());

        System.out.print(String.format("\nDigite o percentual de presença do aluno %s: ", nome));
        percPresenca = Float.parseFloat(sc.nextLine());

        // A palavra var permite que o JAVA crie a variável
        // com o tipo do valor que foi atribuído no código
        final var media = (nota1 + nota2 + nota3 + nota4) / 4.0f;

        // COMPARAÇÃO

        // REGRA aluno aprovado = media >= 7
        // REGRA aluno aprovado = percPresenca >= 75

        // AND -> &&
        // OR  -> ||
        // NOT -> !

        // ERRO -> final define a variável media como constante, portanto não pode ser modificada.
        // media = 10;

        boolean situacao = media >= 7 && percPresenca >= 75;
        System.out.println(situacao);
        System.out.println("\nSituação: " + (situacao ? "Aprovado" : "Reprovado"));
        System.out.println(String.format("\nO aluno %s obteve a média de %.2f com %.2f%% de presença.\n", nome, media, percPresenca));

        sc.close();

        // Salto incondicional -> goto (repetição de um pedaço do programa)
        // Não usar no Java
        // const também não deve ser usado
    }
}
