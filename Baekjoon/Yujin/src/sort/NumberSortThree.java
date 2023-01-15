package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSortThree {
    public static void main(String[] args) throws IOException {
        // 카운팅 정렬

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(bf.readLine());

        int[] countArr = new int[10001];
        // 카운팅 된 숫자 저장

        for (int i = 0; i < num; i++) {
            countArr[Integer.parseInt(bf.readLine())]++;
        }
        bf.close();


        for (int i = 1; i < 10001; i++) {
            while (countArr[i] > 0) {
                sb.append(i).append("\n");
                countArr[i]--;
            }
        }

        System.out.println(sb);
    }
}
