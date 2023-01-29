package study.week2.binarysearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Number2512 {
    public static List<Integer> requestBudgets = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int regionCount = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < regionCount; i++) {
            int requestBudget = Integer.parseInt(st.nextToken());
            requestBudgets.add(requestBudget);
        }

        int maxBudget = Integer.parseInt(br.readLine());

        System.out.println(parametricSearch(regionCount, maxBudget));
    }

    public static int parametricSearch(int regionCount, int maxBudget) {
        int left = 0;
        int right = Collections.max(requestBudgets);

        while (left <= right) {
            int mid = (left + right) / 2;
            int budget = 0;
            for (int i = 0; i < regionCount; i++) {
                if (requestBudgets.get(i) > mid) {
                    budget += mid;
                } else {
                    budget += requestBudgets.get(i);
                }
            }
            if (budget <= maxBudget) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
