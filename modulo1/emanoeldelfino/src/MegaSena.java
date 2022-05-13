import javax.swing.JOptionPane;

public class MegaSena {
    public static void main(String[] args) {
        int[] nums = new int[6];

        String result = "|";

        for (int i = 0; i < 6; i++) {
            nums[i] = (int)Math.round(Math.random() * 60);
            result = result + String.format(" %d | ", nums[i]);
        }

        JOptionPane.showMessageDialog(null, result, "Sorteio MegaSena", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
