import javax.swing.*;

public class EquacaoSegGrau {
    public static void main(String[] args) {
        JTextField campoA = new JTextField(5);
        JTextField campoB = new JTextField(5);
        JTextField campoC = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("A"));
        myPanel.add(campoA);
        myPanel.add(Box.createHorizontalStrut(15)); // espaço
        myPanel.add(new JLabel("B"));
        myPanel.add(campoB);
        myPanel.add(Box.createHorizontalStrut(15)); // espaço
        myPanel.add(new JLabel("C"));
        myPanel.add(campoC);

        JOptionPane.showMessageDialog(null, myPanel, 
                "Calculadora Equação Segundo Grau", JOptionPane.INFORMATION_MESSAGE);

        int a = Integer.parseInt(campoA.getText());
        int b = Integer.parseInt(campoB.getText());
        int c = Integer.parseInt(campoC.getText());

        float delta = (float)Math.sqrt((b * b) - 4f * a * c);
        float x1 = ((-b + delta) / (2f * a));
        float x2 = ((-b - delta) / (2f * a));

        String msg = String.format("Δ  = %.2f\nx1 = %.2f\nx2 = %.2f\n", delta, x1, x2);
        JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
