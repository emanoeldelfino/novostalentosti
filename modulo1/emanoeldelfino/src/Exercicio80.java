import java.util.Arrays;
import java.util.Scanner;

public class Exercicio80 {
    final static int SIZE = 3;
    public static void main(String[] args) {
        int[] nums1 = new int[SIZE];
        int[] nums2 = new int[SIZE];
        int[] nums = new int[SIZE * 2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Vetor 1, Número %d: ", i + 1);
            nums1[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Vetor 2, Número %d: ", i + 1);
            nums2[i] = Integer.parseInt(sc.nextLine());
        }

        // for (int i = 0; i < SIZE * 2; i += 2) {
        //     nums[i] = nums1[(int)(i / 2)];
        //     nums[i + 1] = nums2[(int)(i / 2)];
        // }

        int c = 0;
        for (int i = 0; i < SIZE; i++) {
            nums[c] = nums1[i];
            c++;
            nums[c] = nums2[i];
            c++;
        }

        System.out.printf("\nVetores intercalados: %s.\n\n", Arrays.toString(nums));

        sc.close();
    }
}
