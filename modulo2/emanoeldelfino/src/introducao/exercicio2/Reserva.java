package introducao.exercicio2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    private Quarto quarto;
    private ArrayList<Hospede> listaHospedes = new ArrayList<>();

    public Reserva(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public ArrayList<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void setListaHospedes(ArrayList<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String info = "";

        info += String.format("numero (reserva) = %d\n", numero);
        info += String.format("dataInicial (reserva) = %s\n", sdf.format(dataInicial));
        info += String.format("dataFinal (reserva) = %s\n", sdf.format(dataFinal));

        int n = 1;
        for (Hospede hospede: listaHospedes) {
            info += String.format("hospede %d (nome) = %s\n", n, hospede.getNome());
            info += String.format("hospede %d (CPF) = %s\n", n, hospede.getCPF());
            info += String.format("hospede %d (telefone) = %s\n", n, hospede.getTelefone());

            n++;
        }

        if (quarto != null) {
            info += String.format("numero (quarto) = %s\n", quarto.getNumero());
        }

        return info;
    }
}
