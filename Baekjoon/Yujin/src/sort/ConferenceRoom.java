package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ConferenceRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conferenceNum = scanner.nextInt();

        int[][] conferenceArr = new int[conferenceNum][2];
        for (int i = 0; i < conferenceNum; i++) {
            conferenceArr[i][0] = scanner.nextInt();
            conferenceArr[i][1] = scanner.nextInt();
        }

        Arrays.sort(conferenceArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];

            }
        });

        int answer = 0;
        int endTime = 0;

        for (int i = 0; i < conferenceNum; i++) {
            int startTime = conferenceArr[i][0];

            if (endTime <= startTime) {
                answer += 1;
                endTime = conferenceArr[i][1];
            }

        }
        System.out.println(answer);
    }
}
