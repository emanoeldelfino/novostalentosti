package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
// import java.util.Date;
import java.util.GregorianCalendar;

import introducao.exercicio1.Autor;
import introducao.exercicio1.Livro;

public class App4 {
    public static void main(String[] args) {
        SimpleDateFormat sdf;
        Calendar calendario;

        Livro livro1, livro2, livro3;
        Autor autor;

        // Desta forma cria a data com o valor incorreto
        // Autor autor = new Autor("Deitel", new Date(1945, 01, 01));
        // Para criar a data do jeito certo
        calendario = GregorianCalendar.getInstance();

        sdf = new SimpleDateFormat("dd/MM/yyyy");

        livro1 = new Livro("Java como programar");
        livro1.setValor(349f);
        livro1.setEsgotado(false);

        calendario.set(1945, 01, 01);
        autor = new Autor("Deitel", calendario.getTime());

        livro1.setEscritor(autor);
        // System.out.println(livro1.toString());
        System.out.println(livro1);

        livro2 = new Livro("UML guia do usuário");
        livro2.setValor(165f);
        livro2.setEsgotado(false);

        try {
            autor = new Autor("Grady Booch", sdf.parse("27/02/1955"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        livro2.setEscritor(autor);
        // System.out.println(livro2.toString());
        System.out.println(livro2);

        livro3 = new Livro("Java 2 ensino didático");
        livro3.setValor(126f);
        livro3.setEsgotado(true);
        
        autor = new Autor("Grady Booch", null);
        livro3.setEscritor(autor);

        // System.out.println(livro3.toString());
        System.out.println(livro3);
    }
}
