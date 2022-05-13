package introducao.exercicio1;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {
    private String titulo;
    private float valor;
    private boolean esgotado;
    private Autor escritor;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public boolean isEsgotado() {
        return esgotado;
    }
    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();

        for (Field f : this.getClass().getDeclaredFields()) {
            if (f.getName() != "escritor") {
                try {
                    info.append(f.getName());
                    info.append(" (livro) = ");
                    info.append(f.get(this));
                    info.append("\n");
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        if (escritor != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String strDataNascimento;

            info.append(String.format("nome (escritor) = %s\n", escritor.getNome()));

            Date date = escritor.getDataNascimento();
            if (date != null) {
                strDataNascimento = sdf.format(date);
            } else {
                strDataNascimento = "null";
            }
            info.append(String.format("dataNascimento (escritor) = %s\n", strDataNascimento));
        }

        return info.toString();
    }
}
