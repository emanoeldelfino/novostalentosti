/*
59) Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deverá apresentar os valores das duas temperaturas.
*/

public class Exercicio59 {
    public static void main(String[] args) {
        float celsius, fahrenheit;

        for (int i = 10; i <= 100; i+=10) {
            celsius = (float)i;
            fahrenheit = (celsius * 1.8f) + 32f;
            System.out.printf("\n%6.2f° C = %6.2f° F.", celsius, fahrenheit);
        }
    }
}
