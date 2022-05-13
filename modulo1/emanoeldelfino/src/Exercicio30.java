import javax.swing.*;

public class Exercicio30 {
    public static void main(String[] args) {
        float salary;

        JTextField salaryField = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Salário: R$ "));
        window.add(salaryField);

        JOptionPane.showMessageDialog(null, window, 
                "Reajuste", JOptionPane.INFORMATION_MESSAGE);

        salary = Float.parseFloat(salaryField.getText().replace(",", "."));

        final String msg;

        if (salary < 500) {
            final float salarioAntigo = salary;
            salary = salary * 1.3f;
            msg = String.format("Salário reajustado de R$ %.2f para R$ %.2f.", salarioAntigo, salary);
        } else {
            msg = String.format("Salário não foi reajustado, permanecendo em R$ %.2f.", salary);
        }

        JOptionPane.showMessageDialog(null, msg, 
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
