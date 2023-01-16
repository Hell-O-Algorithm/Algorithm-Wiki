package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Treasure {
    public static List<Integer> aList = new ArrayList<>();
    public static List<Integer> bList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            aList.add(scanner.nextInt());
        }
        Collections.sort(aList);

        for (int i = 0; i < count; i++) {
            bList.add(scanner.nextInt());
        }

        int answer = 0;
        for (Integer num : aList) {
            answer += num * maxNum();
        }
        System.out.println(answer);
    }

    public static int maxNum() {
        int max = Collections.max(bList);
        bList.remove(bList.indexOf(max));
        return max;
    }
}
