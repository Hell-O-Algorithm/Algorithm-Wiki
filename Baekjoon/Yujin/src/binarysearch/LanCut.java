package binarysearch;

import java.io.*;
import java.util.*;

public class LanCut {
    public static List<Integer> lanList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lanCount = Integer.parseInt(st.nextToken());
        int targetNum = Integer.parseInt(st.nextToken());

        long max = 0;
        for (int i = 0; i < lanCount; i++) {
            lanList.add(Integer.parseInt(br.readLine()));
            if (max < lanList.get(i)) {
                max = lanList.get(i);
            }
        }

        max++;
        /**
         * long max = 0 을 선언해서 풀면
         * 오답이 아닌데
         * Collections.max를 사용해서 풀면 오답인데
         * 혹시 왜 그러는지 짐작가는게 있으신가요..
         *
         * 시간초과로 틀린거면 백준 오답 이유에 시간초과가 떴을거같은데
         * 그게 아니라 틀렸습니다 가 나온다.
         */
        long left = 0;
//        long right = Collections.max(lanList) + 1;

        while (left < max) {
            int answer = 0;
            long mid = (left + max) / 2;

            for (int i = 0; i < lanCount; i++) {
                answer += (lanList.get(i) / mid);
            }

            if (answer < targetNum) {
                max = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left - 1);
    }
}
