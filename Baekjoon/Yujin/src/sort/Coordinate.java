package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int arrays[][] = new int[number][2];

        for (int i = 0; i < number; i++) {
            arrays[i][0] = scanner.nextInt();
            arrays[i][1] = scanner.nextInt();
        }

        Arrays.sort(arrays, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });

        for (int i = 0; i < number; i++) {
            System.out.println(arrays[i][0] + " " + arrays[i][1]);
        }

    }
}
