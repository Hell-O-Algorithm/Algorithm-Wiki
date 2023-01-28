package study.week2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lessonsCount = Integer.parseInt(st.nextToken());
        int blurayCount = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] lessonsArr = new int[lessonsCount];
        long max = 0;
        long min = 0;
        for (int i = 0; i < lessonsCount; i++) {
            lessonsArr[i] = Integer.parseInt(st.nextToken());
            max += lessonsArr[i];
            if (min < lessonsArr[i]) {
                min = lessonsArr[i];
            }
        }

        long answer = 0;
        while (min <= max) {
            long mid = (min + max) / 2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < lessonsCount; i++) {
                if (sum + lessonsArr[i] > mid) {
                    count += 1;
                    sum = 0;
                }
                sum += lessonsArr[i];
            }

            if (sum > 0) {
                count += 1;
            }

            if (count > blurayCount) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            answer = min ;
        }
        System.out.println(answer);
    }
}
