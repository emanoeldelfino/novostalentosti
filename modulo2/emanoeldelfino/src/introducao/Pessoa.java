package introducao;

// fôrma
public class Pessoa {
    // package serve para organizar código

    // Atributos (variáveis) automaticamente inicializados com um valor padrão
    // String - ""
    // Número - 0
    // Boolean - False
    // Objeto - Null
    private String nome;
    public int idade;
    public String CPF;
    public float altura;

    // GETTER e SETTER
    
    // getVariavel() // setVariavel()
    public String getNome() {
        return this.nome;
    }

    // Para nome imutável basta remover o set
    public void setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
        }
    }

    // Proteger a variável é encapsulamento

    // comportamento
    // CONSTRUTOR - Inicializar um objeto e definir valores obrigatórios
    // new cai no construtor
    public Pessoa(String nome) { // escopo da variável local
        // pode ser feito qualquer tipo de código aqui, menos return
        System.out.printf("CONSTRUTOR: %s\n", nome);
        // this.nome = nome;
        setNome(nome);
    }

    // Método (função (termo incorreto para orientação à objetos))
    // Assinatura de um método
    // ModificadorDeAcesso tipoDeRetorno nomeDoMetodo (parametros) { corpo }
    public String podeDirigir(){
        if (this.idade >= 18) {
            return "Pode dirigir";
        } else {
            return "Não pode dirigir";
        }
    }

    public void mostraCPF() {
        System.out.println(this.CPF);
    }
}
