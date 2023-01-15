package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoNumAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = scanner.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < numCount; i++) {
            numList.add(scanner.nextInt());
        }

        Collections.sort(numList);

        int targetNum = scanner.nextInt();

        int left = 0;
        int right = numList.size() - 1;
        int answer = 0;

        while (left < right) {
            int sum = numList.get(left) + numList.get(right);
            if (sum == targetNum) {
                answer += 1;
                left += 1;
                right -= 1;
            } else if (sum < targetNum) {
                left += 1;
            } else if (sum > targetNum) {
                right -= 1;
            }
        }
        System.out.println(answer);
    }
}
