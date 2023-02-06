package study.week5.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] candidateArr = new int[count];

        int candidateOne = 0;
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                candidateOne = Integer.parseInt(br.readLine());
            } else {
                candidateArr[i] = Integer.parseInt(br.readLine());
            }
        }

        int max = 0;
        int answer = 0;
        while (true) {
            Arrays.sort(candidateArr);

            max = candidateArr[count - 1];
            if (max >= candidateOne) {
                answer += 1;
                candidateOne += 1;
                candidateArr[count - 1] = (max - 1);
            } else {
                break;
            }
        }

        System.out.println(answer);
    }
}