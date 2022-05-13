import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        String windowTitle = "Cálculo Área Losango";
        String aux;
        final float bigDiagonal, smallDiagonal, lozengeArea;

        aux = JOptionPane.showInputDialog(null, "Diagonal Maior (cm)", windowTitle, JOptionPane.INFORMATION_MESSAGE);
        bigDiagonal = Float.parseFloat(aux.replace(",", "."));
        aux = JOptionPane.showInputDialog (null, "Diagonal Menor (cm)", windowTitle, JOptionPane.INFORMATION_MESSAGE);
        smallDiagonal = Float.parseFloat(aux.replace(",", "."));
        lozengeArea = (bigDiagonal * smallDiagonal) / 2.0f;

        JOptionPane.showMessageDialog(null, String.format("A área do losango é de %.2f cm².", lozengeArea), windowTitle, JOptionPane.INFORMATION_MESSAGE);
    }
}
