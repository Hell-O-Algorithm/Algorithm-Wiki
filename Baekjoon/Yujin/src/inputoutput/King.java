package inputoutput;

import java.util.Scanner;

public class King {
    public static void main(String[] args) {
        int[] findArray = new int[6];
        int[] cheseArray = {1, 1, 2, 2, 2, 8};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            findArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(cheseArray[i] - findArray[i] + " ");
        }
    }
}
