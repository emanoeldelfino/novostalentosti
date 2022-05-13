import javax.swing.*;

public class Exercicio20 {
    public static void main(String[] args) {
        final int hours, minutes, hoursToMinutes, totalMinutes, totalSeconds;

        JTextField fieldHour = new JTextField(5);
        JTextField fieldMinutes = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Horas"));
        window.add(fieldHour);
        window.add(Box.createHorizontalStrut(15)); // espaço
        window.add(new JLabel("Minutos"));
        window.add(fieldMinutes);

        JOptionPane.showMessageDialog(null, window, 
                "Conversor Horas e Minutos", JOptionPane.INFORMATION_MESSAGE);

        hours = Integer.parseInt(fieldHour.getText());
        minutes = Integer.parseInt(fieldMinutes.getText());

        hoursToMinutes = hours * 60;
        totalMinutes = minutes + hoursToMinutes;
        totalSeconds = totalMinutes * 60;

        String msg = String.format("Hora digita convertida em minutos: %d\nTotal de minutos: %d\nTotal de segundos: %d", hoursToMinutes, totalMinutes, totalSeconds);
        JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
