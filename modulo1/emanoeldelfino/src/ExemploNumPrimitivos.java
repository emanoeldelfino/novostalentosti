public class ExemploNumPrimitivos {
    public static void main(String[] args) throws Exception {
        // Byte vai de -128 a 127 porque tem no máximo 8 bits
        // 0111 1111 -> o primeiro bit é para dizer se o n° é
        // positivo ou negativo e não pode ser usado

        // Objeto BIGINT -> long -> int -> short

        char umaLetra = 'a';
        System.out.println(umaLetra);
        System.out.println((int)umaLetra);

        long numGrande = 10;
        System.out.println(numGrande);
    
        // ERRO: int não suporta os 64 bits do long
        // int vaidarruim = 10L;
        
        int salario = (int)1210.5f;
        System.out.println(salario);

        // float divide seus 32 bits entre parte inteira e decimal
        // 16 bits para inteira e 16 bits para decimal

        // Erro: qualquer número digitado com um ponto no meio
        // sem mais nada é um double, e o float não suporta este.
        // float imposto = 1000.0;
    }
}
