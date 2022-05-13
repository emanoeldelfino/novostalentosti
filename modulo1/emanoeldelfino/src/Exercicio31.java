import javax.swing.*;

public class Exercicio31 {
    public static void main(String[] args) {
        String aux, msg;
        final int option;

        aux = JOptionPane.showInputDialog(null, "1 - Soma;\n2 - Raiz quadrada.\n\nOpção: ", "", JOptionPane.INFORMATION_MESSAGE);
        // System.out.println(aux);
        option = Integer.parseInt(aux);

        if (option == 1) {
            final int num1, num2, sum;
            aux = JOptionPane.showInputDialog(null, "Número 1: ", "", JOptionPane.INFORMATION_MESSAGE);
            num1 = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog(null, "Número 2: ", "", JOptionPane.INFORMATION_MESSAGE);
            num2 = Integer.parseInt(aux);

            sum = num1 + num2;

            msg = String.format("A soma entre %d e %d é %d.", num1, num2, sum);
            
            JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (option == 2) {
            final int num;
            final double sqrRoot;
            aux = JOptionPane.showInputDialog(null, "Número 1: ", "", JOptionPane.INFORMATION_MESSAGE);
            num = Integer.parseInt(aux);

            sqrRoot = Math.sqrt(num);

            msg = String.format("A raiz quadrada de %d é %.2f.", num, sqrRoot);

            JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida!", "Inválido", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
