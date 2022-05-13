import javax.swing.*;

public class Exercicio28 {
    public static void main(String[] args) {
        final int idade;
        final String maioridade;

        JTextField ageField = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Idade: "));
        window.add(ageField);

        JOptionPane.showMessageDialog(null, window, 
                "Maioridade", JOptionPane.INFORMATION_MESSAGE);

        idade = Integer.parseInt(ageField.getText());
        maioridade = (idade < 18 ? " não" : "");

        String msg = String.format("Com %d anos você%s está na maoiridade.", idade, maioridade);

        JOptionPane.showMessageDialog(null, msg, 
                "Maioridade", JOptionPane.INFORMATION_MESSAGE);
    }
}
