package introducao.exercicio4;

public class EmpresaCliente extends PessoaJuridica {
    private float lucroAnual;
    private boolean recuperacaoJudicial;

    public float getLucroAnual() {
        return lucroAnual;
    }
    public void setLucroAnual(float lucroAnual) {
        this.lucroAnual = lucroAnual;
    }
    public boolean isRecuperacaoJudicial() {
        return recuperacaoJudicial;
    }
    public void setRecuperacaoJudicial(boolean recuperacaoJudicial) {
        this.recuperacaoJudicial = recuperacaoJudicial;
    }
}
