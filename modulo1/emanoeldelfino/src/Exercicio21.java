import javax.swing.*;

public class Exercicio21 {
    public static void main(String[] args) {
        final float salary, raisePerc, raiseValue, newSalary;

        JTextField salaryField = new JTextField(5);
        JTextField raiseField = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Salário: R$"));
        window.add(salaryField);
        window.add(Box.createHorizontalStrut(15)); // espaço
        window.add(new JLabel("Percentual Aumento: "));
        window.add(raiseField);

        JOptionPane.showMessageDialog(null, window, 
                "Cálculo Aumento Salarial", JOptionPane.INFORMATION_MESSAGE);

        salary = Float.parseFloat(salaryField.getText().replace(",", "."));
        raisePerc = Float.parseFloat(raiseField.getText().replace(",", "."));

        raiseValue = (salary * (raisePerc / 100f));
        newSalary = salary + raiseValue;

        String msg = String.format("Valor do aumento: R$ %.2f\nNovo salário: R$ %.2f", raiseValue, newSalary);
        JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
