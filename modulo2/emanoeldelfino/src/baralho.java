import java.util.ArrayList;
import java.util.Scanner;

public class baralho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] output = new String[4];
        ArrayList<String> cards = new ArrayList<>();

        int i, j;
        String[] letters = {"C", "E", "U", "P"};
        String lettersStr = "CEUP";

        for (i = 1; i <= 13; i++) {
            for (j = 0; j < letters.length; j++) {
                cards.add(String.format("%02d%s", i, letters[j]));
            }
        }

        ArrayList<String> cardsAux = new ArrayList<>(cards);
        Boolean[] cardErrs = {false, false, false, false};

        for (i = 0; i < input.length(); i+=3) {
            String card = input.substring(i, i + 3);
            if (!cardsAux.remove(card)) {
                String cardLetterErr = card.substring(2, 3);
                cardErrs[lettersStr.indexOf(cardLetterErr)] = true;
            }
        }

        for (i = 0; i < letters.length; i++) {
            if (!cardErrs[i]) {
                String letterCmp = letters[i];
                int sum = 0;
                for (j = 0; j < input.length(); j+=3) {
                    String card = input.substring(j, j + 3);
                    String letterCard = card.substring(2, 3);
                    if (letterCmp.equals(letterCard)) {
                        sum++;
                    }
                    output[i] = Integer.toString(13 - sum);
                }
            } else {
                output[i] = "erro";
            }
        }
        for (String line : output) {
            System.out.println(line);
        }
    }
}
