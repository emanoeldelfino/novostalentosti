// package cap02;
import javax.swing.JOptionPane;
public class Teste {
    public static void main (String args[]) {
        String aux;
        float largura, comprimento, area, perimetro;

        aux = JOptionPane.showInputDialog(null, "Entre com o comprimento", "", JOptionPane.INFORMATION_MESSAGE);
        comprimento = Float.parseFloat (aux);
        aux = JOptionPane.showInputDialog (null, "Entre com a largura", "", JOptionPane.INFORMATION_MESSAGE);
        largura = Float.parseFloat(aux);
        area = comprimento * largura;
        perimetro = comprimento * 2 + largura * 2;
        JOptionPane.showMessageDialog (null, "Área : " + area + ", Perimetro: " + perimetro, "", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
