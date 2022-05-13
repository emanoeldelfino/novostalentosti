import javax.swing.*;

public class Exercicio25 {
    public static void main(String[] args) {
        final float salary, check1, check2, discount, currentBalance;

        JTextField salaryField = new JTextField(5);
        JTextField check1Field = new JTextField(5);
        JTextField check2Field = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Salário: R$ "));
        window.add(salaryField);
        window.add(Box.createHorizontalStrut(15)); // espaço
        window.add(new JLabel("Valor cheque 1: R$ "));
        window.add(check1Field);
        window.add(Box.createHorizontalStrut(15)); // espaço
        window.add(new JLabel("Valor cheque 2: R$ "));
        window.add(check2Field);

        JOptionPane.showMessageDialog(null, window, 
                "Desconto Cheques", JOptionPane.INFORMATION_MESSAGE);

        salary = Float.parseFloat(salaryField.getText().replace(",", "."));
        check1 = Float.parseFloat(check1Field.getText().replace(",", "."));
        check2 = Float.parseFloat(check2Field.getText().replace(",", "."));

        discount = (check1 * 1.0038f) + (check2 * 1.0038f);
        currentBalance = salary - discount;

        String msg = String.format("Novo saldo: R$ %.2f", currentBalance);

        JOptionPane.showMessageDialog(null, msg, 
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
