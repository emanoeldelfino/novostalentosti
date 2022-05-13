package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import introducao.exercicio7.Casa;
import introducao.exercicio7.ContaLuz;

public class App10 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Casa casa1 = new Casa();
        ContaLuz conta1 = new ContaLuz();
        ContaLuz conta2 = new ContaLuz();

        try {
            conta1.setDataRelogio(sdf.parse("01/04/2022"));
            conta1.setDataPagamento(sdf.parse("02/04/2022"));

            conta2.setDataRelogio(sdf.parse("01/05/2022"));
            conta2.setDataPagamento(sdf.parse("02/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        conta1.setNumero(1L);
        conta1.setKwGasto(10f);
        conta1.setValor(500f);

        conta2.setNumero(2L);
        conta2.setKwGasto(15f);
        conta2.setValor(400f);

        var contas = casa1.getContas();
        contas.add(conta1);
        contas.add(conta2);

        System.out.printf("Mês de maior consumo: %s.\n", casa1.getMesMaiorConsumo());
        System.out.printf("Mês de menor consumo: %s.\n", casa1.getMesMenorConsumo());
        System.out.printf("Média do consumo mensal: %s.\n", casa1.calcMediaConsumo());
    }
}
