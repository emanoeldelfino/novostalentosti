import java.awt.Color;
import javax.swing.JFrame;

public class RandomColor {

    private static int randomNum() {
        return (int)Math.floor(Math.random() * 255);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);

        while (true) {
            frame.getContentPane().setBackground(new Color(randomNum(), randomNum(), randomNum()));
            // Thread.sleep(1000);
        }
    }
}
