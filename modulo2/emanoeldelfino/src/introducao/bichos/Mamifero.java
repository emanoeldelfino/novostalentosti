package introducao.bichos;

// JAVA (e Python) não dá suporte à HERANÇA Múltipla
// C++ dá suporte a HERANÇA Múltipla
public class Mamifero extends Animal {
    private boolean geraLeite;

    public boolean isGeraLeite() {
        return geraLeite;
    }

    public void setGeraLeite(boolean geraLeite) {
        this.geraLeite = geraLeite;
    }
}
