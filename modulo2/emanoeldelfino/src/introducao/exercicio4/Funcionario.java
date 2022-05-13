package introducao.exercicio4;

public class Funcionario extends PessoaFisica {
    private float salario;
    private int horasExtras;

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public int getHorasExtras() {
        return horasExtras;
    }
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
}
