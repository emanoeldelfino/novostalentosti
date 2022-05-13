import javax.swing.*;

public class Exercicio29 {
    public static void main(String[] args) {
        // final int num = Integer.parseInt(args[0]);

        // System.out.printf("O número %d é %sPAR.\n\n", num, (num % 2 == 1 ? "�?M" : ""));

        final int numero;

        JTextField numField = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Número: "));
        window.add(numField);

        JOptionPane.showMessageDialog(null, window, 
                "Par ou �?mpar", JOptionPane.INFORMATION_MESSAGE);

        numero = Integer.parseInt(numField.getText());

        String msg = String.format("O número %d é %s.", numero, numero % 2 == 0 ? "par" : "ímpar");

        JOptionPane.showMessageDialog(null, msg, 
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
