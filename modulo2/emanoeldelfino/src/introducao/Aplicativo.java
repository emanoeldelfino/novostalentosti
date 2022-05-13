package introducao;

public class Aplicativo {
    private String nome;

    // do mais permissivo para menos permissivo
    // public, protected, default e private.

    public Aplicativo(String nome) {
        // Pode ser chamadoo antes de ser definido, pois
        // o new cria tudo ao instanciar.
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Ensina o Java a mostrar o objeto em modo texto
    // Sobrescreve o toString
    public String toString() {
        return getNome();
    }
}
