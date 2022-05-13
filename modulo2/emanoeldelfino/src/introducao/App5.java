package introducao;

import introducao.exercicio2.Hospede;
import introducao.exercicio2.Quarto;
import introducao.exercicio2.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App5 {
    // Não é uma boa usar o throws na main, pois ele manda a 
    // exceção para o Java que interrompe o programa, similar a 
    // uma tela azul do SO.
    // O try catch é melhor, pois assim evita interromper a
    // execução do programa.
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Hospede pessoa1, pessoa2, pessoa3, pessoa4, pessoa5;
        Reserva reserva1, reserva2;
        Quarto quarto1, quarto2;

        pessoa1 = new Hospede("111.111.111-11");
        pessoa1.setNome("Zezinho");
        pessoa1.setTelefone("5555-1234");

        pessoa2 = new Hospede("222.222.222-22");
        pessoa2.setNome("Mariazinha");
        pessoa2.setTelefone("5555-4321");

        reserva1 = new Reserva(1001);
        try {
            reserva1.setDataInicial(sdf.parse("28/04/2022"));
            reserva1.setDataFinal(sdf.parse("05/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        quarto1 = new Quarto();
        quarto1.setNumero(100);

        var hospedes1 = reserva1.getListaHospedes();
        hospedes1.add(pessoa1);
        hospedes1.add(pessoa2);

        reserva1.setQuarto(quarto1);

        // System.out.println(reserva1.toString());
        System.out.println(reserva1);

        pessoa3 = new Hospede("333.333.333-33");
        pessoa3.setNome("Luizinho");
        pessoa3.setTelefone("5555-1122");
        
        pessoa4 = new Hospede("444.444.444-44");
        pessoa4.setNome("Huguinho");
        pessoa4.setTelefone("5555-2233");

        pessoa5 = new Hospede("5555.555.555-55");
        pessoa5.setNome("Paulinha");
        pessoa5.setTelefone("5555-5555");

        reserva2 = new Reserva(1002);
        try {
            reserva2.setDataInicial(sdf.parse("21/04/2022"));
            reserva2.setDataFinal(sdf.parse("28/04/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        quarto2 = new Quarto();
        quarto2.setNumero(200);

        var hospedes2 = reserva2.getListaHospedes();
        hospedes2.add(pessoa3);
        hospedes2.add(pessoa4);
        hospedes2.add(pessoa5);

        reserva2.setQuarto(quarto2);

        // System.out.println(reserva2.toString());
        System.out.println(reserva2);
    }
}
