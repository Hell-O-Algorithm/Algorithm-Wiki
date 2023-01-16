package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AgeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][] userArray = new int[count][2];
        String[] userNameArray = new String[count];
        String[] answerUserNameArray = new String[count];

        for (int i = 0; i < count; i++) {
            userArray[i][0] = scanner.nextInt();
            userArray[i][1] = i;
            userNameArray[i] = scanner.next();
        }


        Arrays.sort(userArray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });

        for (int i = 0; i < count; i++) {
            answerUserNameArray[i] = userNameArray[userArray[i][1]];
        }


        for (int i = 0; i < count; i++) {
            System.out.println(userArray[i][0] + " " + answerUserNameArray[i]);
        }
    }
}
