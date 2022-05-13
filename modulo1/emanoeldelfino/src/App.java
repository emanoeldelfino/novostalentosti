public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Mundo!");
        System.out.println("Teste");

        // System.out.println("Hello, World!");
    
        // ENTRADA
        // int => valor inteiro
        // ATRIBUIÇÃO DE VALOR => variavel = valor;
        int prinum = 7;
        int segnum = 2;

        // PROCESSAMENTO
        // ATRIBUIÇÃO DE VALOR
        int soma = prinum + segnum;
        int sub = prinum - segnum;
        int mult = prinum * segnum;
        float div = (float)prinum / (float)segnum;

        // SAÍDA
        // System.out.print("O resultado é: ");
        // System.out.print(resultado);
        // System.out.println(".");

        // CONCATENAÇÃO
        // System.out.println("O resultado é: " + resultado + ".");

        // INTERPOLAÇÃO DE STRINGS
        // %d e %f = MÁSCARA
        // System.out.println(String.format("O resultado é: %d.", resultado));
    
        // SOMA
        // System.out.println("Soma: " + soma);
        System.out.println(String.format("Soma = %d + %d = %d", prinum, segnum, soma));

        // SUBTRAÇÃO
        // System.out.println("Subtração: " + sub);
        System.out.println(String.format("Subtração = %d - %d = %d", prinum, segnum, sub));

        // MULTIPLICAÇÃO
        // System.out.println("Multiplicação: " + mult);
        System.out.println(String.format("Multiplicação = %d x %d = %d", prinum, segnum, mult));

        // DIVISÃO
        System.out.println(String.format("Divisão = %d / %d = %.2f", prinum, segnum, div));

        // Tipo lógico (booleano) => true ou false
        boolean comp = prinum == segnum;

        System.out.println(String.format("Comparação = %b.", comp));
        System.out.println("Comparação é " + (comp ? "Verdadeiro" : "Falso"));

        // String é um objeto que cuida de textos
        String nome = "Emanoel da Silva Delfino";

        System.out.println(nome.replace("a", "$"));
        System.out.println(nome);

        char letra = 'a';
        System.out.println(letra);
    }
}
