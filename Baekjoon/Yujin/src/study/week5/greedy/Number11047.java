package study.week5.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coinCount = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        int[] coinArr = new int[coinCount];
        for (int i = 0; i < coinCount; i++) {
            coinArr[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        for (int i = (coinCount - 1); i >= 0; i--) {
            if (goal >= coinArr[i]) {
                answer = answer + (goal / coinArr[i]);
                goal = goal % coinArr[i];
            }
        }

        System.out.println(answer);
    }
}
