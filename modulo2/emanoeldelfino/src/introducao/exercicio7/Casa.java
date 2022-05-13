package introducao.exercicio7;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;

public class Casa {
    ArrayList<ContaLuz> contas = new ArrayList<>();

    public ArrayList<ContaLuz> getContas() {
        return contas;
    }

    public void setContas(ArrayList<ContaLuz> contas) {
        this.contas = contas;
    }

    public String getMesMenorConsumo() {
        ContaLuz contaMenor = contas.get(0);
        for (int i = 1; i < contas.size(); i++) {
            ContaLuz conta = contas.get(i);
            if (conta.getKwGasto() < contaMenor.getKwGasto()) {
                contaMenor = conta;
            }
        }
        LocalDate data = contaMenor.getDataRelogio().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String mes = data.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        return mes;
    }

    public String getMesMaiorConsumo() {
        ContaLuz contaMaior = contas.get(0);
        for (int i = 1; i < contas.size(); i++) {
            ContaLuz conta = contas.get(i);
            if (conta.getKwGasto() > contaMaior.getKwGasto()) {
                contaMaior = conta;
            }
        }
        LocalDate data = contaMaior.getDataRelogio().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String mes = data.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        return mes;
    }

    public float calcMediaConsumo() {
        float soma = 0f;

        for (ContaLuz conta : contas) {
            soma += conta.getKwGasto();
        }

        float media = soma / (float)contas.size();

        return media;
    }
}
