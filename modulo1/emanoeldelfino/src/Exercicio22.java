import javax.swing.*;

public class Exercicio22 {
    public static void main(String[] args) {
        final float baseSalary, salaryToReceive;

        JPanel window = new JPanel();
        JTextField salaryField = new JTextField(5);

        window.add(new JLabel("Salário: R$ "));
        window.add(salaryField);

        JOptionPane.showMessageDialog(null, window, 
                "Cálculo Salário a Receber", JOptionPane.INFORMATION_MESSAGE);

        baseSalary = Float.parseFloat(salaryField.getText().replace(",", "."));
        salaryToReceive = (baseSalary * .9f) + 50f;

        String msg = String.format("Salário a receber: R$ %.2f", salaryToReceive);
        JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
