package introducao.exercicio7;

import java.util.Date;

public class ContaLuz {
    private Date dataRelogio;
    private long numero;
    private float kwGasto;
    private float valor;
    private Date dataPagamento;

    public Date getDataRelogio() {
        return dataRelogio;
    }
    public void setDataRelogio(Date dataRelogio) {
        this.dataRelogio = dataRelogio;
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public float getKwGasto() {
        return kwGasto;
    }
    public void setKwGasto(float kwGasto) {
        this.kwGasto = kwGasto;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
