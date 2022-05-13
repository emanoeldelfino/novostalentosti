import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
        String windowTitle = "Conversor Temperatura", aux, msg;
        final float celsius, fahrenheit;

        aux = JOptionPane.showInputDialog(null, "Temperatura em Celsius: ", windowTitle, JOptionPane.INFORMATION_MESSAGE);
        celsius = Float.parseFloat(aux.replace(",", "."));
        fahrenheit = ((celsius * 1.8f) + 32f);

        msg = String.format("%.2f° Celsius = %.2f° Fahrenheit.", celsius, fahrenheit);

        JOptionPane.showMessageDialog(null, msg, windowTitle, JOptionPane.INFORMATION_MESSAGE);
    }
}
