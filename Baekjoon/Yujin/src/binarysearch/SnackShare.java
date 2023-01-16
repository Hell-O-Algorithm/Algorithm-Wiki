package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnackShare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int kidCount = Integer.parseInt(st.nextToken());
        int snackCount = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] snacksLen = new int[snackCount];
        int max = 0;
        for (int i = 0; i < snackCount; i++) {
            snacksLen[i] = Integer.parseInt(st.nextToken());
            if (max < snacksLen[i]) {
                max = snacksLen[i];
            }
        }
        max++;

        int min = 1;

        while (min < max) {
            int mid = (min + max) / 2;
            int answer = 0;
            for (int snackLen : snacksLen) {
                answer += (snackLen / mid);
            }

            if (answer < kidCount) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        sb.append(min - 1);
        System.out.println(sb);
    }
}
