import javax.swing.*;

public class Exercicio24 {
    public static void main(String[] args) {
        final float minSalary, workedHours, grossSalary, valWorkedHour, tax, salaryToReceive;

        JTextField minSalaryField = new JTextField(5);
        JTextField workedHoursField = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Salário Mínimo: R$ "));
        window.add(minSalaryField);
        window.add(Box.createHorizontalStrut(15)); // espaço
        window.add(new JLabel("Horas trabalhadas: "));
        window.add(workedHoursField);

        JOptionPane.showMessageDialog(null, window, 
                "Cálculo Salário a Receber", JOptionPane.INFORMATION_MESSAGE);

        minSalary = Float.parseFloat(minSalaryField.getText().replace(",", "."));
        workedHours = Float.parseFloat(workedHoursField.getText().replace(",", "."));

        valWorkedHour = minSalary / 2f;
        grossSalary = workedHours * valWorkedHour;
        tax = grossSalary * .03f;
        salaryToReceive = grossSalary - tax;

        String msg = String.format("Salário a receber: R$ %.2f", salaryToReceive);
        JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
