import javax.swing.*;

public class Exercicio26 {
    public static void main(String[] args) {
        final float salarioMin, consumoKw, valorPorKw, valorAPagar, valorCDesconto;

        JTextField campoSalarioMin = new JTextField(5);
        JTextField campoKw = new JTextField(5);

        JPanel window = new JPanel();

        window.add(new JLabel("Salário mínimo: R$ "));
        window.add(campoSalarioMin);
        window.add(Box.createHorizontalStrut(15)); // espaço
        window.add(new JLabel("Quantidade de quilowatts consumida:  "));
        window.add(campoKw);

        JOptionPane.showMessageDialog(null, window, 
                "Desconto Cheques", JOptionPane.INFORMATION_MESSAGE);

        salarioMin = Float.parseFloat(campoSalarioMin.getText().replace(",", "."));
        consumoKw = Float.parseFloat(campoKw.getText().replace(",", "."));

        valorPorKw = salarioMin * .2f;
        valorAPagar = consumoKw * valorPorKw;
        valorCDesconto = valorAPagar * .85f;

        String msg = String.format("Valor por KW: R$ %.2f\nValor a pagar: R$ %.2f\nValor com desconto de 15%%: R$ %.2f", valorPorKw, valorAPagar, valorCDesconto);

        JOptionPane.showMessageDialog(null, msg, 
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
