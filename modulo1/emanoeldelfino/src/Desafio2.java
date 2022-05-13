import java.util.Arrays;
import java.util.Scanner;

public class Desafio2 {
    private static final int SIZE = 3;
    public static void main(String[] args) {
        int smallest = 0, largest = 0, middle = 0;
        int[] nums = new int[SIZE]; 

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Número %d: ", i + 1);
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("\nNúmero %d: %d", i + 1, nums[i]);
        }

        smallest = nums[0];
        middle = nums[(int)(SIZE / 2)];
        largest = nums[SIZE - 1];

        System.out.printf("\n\nMenor: %d\nDo meio: %d\nMaior: %d", smallest, middle, largest);

        sc.close();
        // int num1, num2, num3, largest, smallest, middle;

        // Scanner input = new Scanner(System.in);

        // System.out.print("Número 1: ");
        // num1 = input.nextInt();
        // System.out.print("Number 2: ");
        // num2 = input.nextInt();
        // System.out.print("Number 3: ");
        // num3 = input.nextInt();

        // // String msg = "\nMenor: %d\nDo meio: %d\nMaior: %d";

        // smallest = num1;
        // middle = num1;
        // largest = num1;

        // if (num2 < smallest)
        //     smallest = num2;
        // if (num3 < smallest)
        //     smallest = num3;

        // if (num2 > largest)
        //     largest = num2;
        // if (num3 > largest)
        //     largest = num3;

        // if (num2 > smallest && num2 < largest)
        //     middle = num2;
        // if (num3 > smallest && num3 < largest)
        //      middle = num3;

        // // if (num1 > num2) {
        // //     if (num1 > num3) {
        // //         largest = num1;

        // //         if (num2 > num3) {
        // //             smallest = num3;
        // //             middle = num2;
        // //         } else {
        // //             smallest = num2;
        // //             middle = num3;
        // //         }
        // //     } else {
        // //         smallest = num2;
        // //         middle = num1;
        // //         largest = num3;
        // //     }
        // // } else {
        // //     if (num2 > num3) {
        // //         largest = num2;

        // //         if (num1 > num3) {
        // //             smallest = num3;
        // //             middle = num1;
        // //         } else {
        // //             smallest = num1;
        // //             middle = num3;
        // //         }
        // //     } else {
        // //         smallest = num1;
        // //         middle = num2;
        // //         largest = num3;
        // //     }
        // // }

        // System.out.printf("\nMenor: %d\nDo meio: %d\nMaior: %d", smallest, middle, largest);

        // input.close();
    }
}
