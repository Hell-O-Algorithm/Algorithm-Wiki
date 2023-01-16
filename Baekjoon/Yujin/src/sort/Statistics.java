package sort;

import java.io.IOException;
import java.util.*;

public class Statistics {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] sortNum = new int[num];

        int sum = 0;

        for (int i = 0; i < num; i++) {
            sortNum[i] = scanner.nextInt();
        }

        Arrays.sort(sortNum);
        int len = sortNum.length;
        for (int i = 0; i < len; i++) {
            sum += sortNum[i];
        }



        // 평균
        System.out.println(sum / len);
        // 중앙값
        System.out.println(sortNum[len / 2]);
        // 최빈값
//        System.out.println(mid);
        // 범위
        System.out.println(Math.abs(sortNum[len-1] - sortNum[0]));


    }
}
