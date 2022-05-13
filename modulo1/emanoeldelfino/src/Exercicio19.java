import javax.swing.*;

public class Exercicio19 {
    public static void main(String[] args) {
        JTextField widthField = new JTextField(5);
        JTextField lengthField = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Largura (m):"));
        window.add(widthField);
        window.add(Box.createVerticalStrut(5)); // espaço
        window.add(new JLabel("\nComprimento (m):"));
        window.add(lengthField);

        JOptionPane.showMessageDialog(null, window, "", JOptionPane.INFORMATION_MESSAGE);

        final float width = Float.parseFloat(widthField.getText().replace(",", "."));
        final float length = Float.parseFloat(lengthField.getText().replace(",", "."));

        final float area = width * length;
        final float power = area * 18f;

        String msg = String.format("Área: %.2f m²\nPotência necessária para iluminação do cômodo: %.2f Watts", area, power);
        JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
