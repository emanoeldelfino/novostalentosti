import javax.swing.*;

public class Exercicio27 {
    public static void main(String[] args) {
        final float reais, dolares, marcoAlemao, libraEsterlina;

        JTextField realsField = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Dinheiro : R$ "));
        window.add(realsField);

        JOptionPane.showMessageDialog(null, window, 
                "Conversão Reais", JOptionPane.INFORMATION_MESSAGE);

        reais = Float.parseFloat(realsField.getText().replace(",", "."));
        dolares = reais / 4.96019f; // 1.8f;
        marcoAlemao = reais / 2.8358f; // 2f;
        libraEsterlina = reais / 6.5399f; // 1.57f;

        String msg = String.format("Valor de R$ %.2f convertido para:\n\nDólares: U$ %.2f\nMarco Alemão: DM %.2f\nLibra Esterlina: £ %.2f", reais, dolares, marcoAlemao, libraEsterlina);

        JOptionPane.showMessageDialog(null, msg, 
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
