package study.week2.binarysearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Number1920 {
    public static List<Integer> numList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numCount; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(numList);

        int findNumCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < findNumCount; i++) {
            int num = Integer.parseInt(st.nextToken());
            bw.write(binarySearch(num) + "\n");
        }
        bw.flush();
    }

    public static int binarySearch(int num) {
        int left = 0;
        int right = numList.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (num == numList.get(mid)) {
                return 1;
            } else if (num < numList.get(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }
}
