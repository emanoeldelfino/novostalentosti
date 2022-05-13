public class Exercicio23 {
    public static void main(String[] args) {
        // X=1, A=3, B=5, C=8 e D=7  
        // LEGENDA: ! = não : & - E(AND)  : | - OU(OR)
        // Expressão                        | RES (Verdadeiro?/Falso?) 
        // RES = !(x>3)                     | VERDADEIRO
        // RES = (X < 1) & !(B>D)           | FALSO
        // RES = !(D<0) & (C>5)             | VERDADEIRO
        // RES = !(X>3) | (C<7)             | FALSO
        // RES = (A>B) | (C>B)              | VERDADEIRO
        // RES = (X>=2)                     | FALSO
        // RES = (X<1) & (B>=D)             | FALSO
        // RES = (D<0) | (C>5)              | VERDADEIRO
        // RES = !(D>3) | !(B<7)            | VERDADEIRO
        // RES = (A>B) | !(C>B)             | FALSO
    }
}
