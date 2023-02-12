package study.week5.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = Integer.parseInt(br.readLine());

        int count = 0;

        while (change > 0) {
            if (change % 5 == 0) {
                count = count + (change / 5);
                break;
            } else {
                change -= 2;
                count += 1;
            }
        }

        if (change < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
