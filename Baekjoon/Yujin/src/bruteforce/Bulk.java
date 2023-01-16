package bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] weights = new int[num];
        int[] heights = new int[num];

        for (int i = 0; i < num; i++) {
            weights[i] = scanner.nextInt();
            heights[i] = scanner.nextInt();
        }

        Bulk(weights, heights);
    }

    public static void Bulk(int[] weights, int[] heights) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < weights.length; i++) {
            int weight = weights[i];
            int height = heights[i];
            int count = 0;
            for (int j = 0; j < weights.length; j++) {
                if (weight < weights[j] && height < heights[j]) {
                    count++;
                }
            }
            answer.add(count + 1);
        }

        for (Integer rank : answer) {
            System.out.printf("%d ", rank);
        }

    }

}
