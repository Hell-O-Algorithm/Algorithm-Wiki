package sort;

import java.util.*;

public class FindNum {
    public static Set<Integer> targetNumSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumCount = scanner.nextInt();
        for (int i = 0; i < targetNumCount; i++) {
            targetNumSet.add(scanner.nextInt());
        }

        int findNumCount = scanner.nextInt();
        for (int i = 0; i < findNumCount; i++) {
            checkNum(scanner.nextInt());
        }
    }

    public static void checkNum(int num) {
        if (targetNumSet.contains(num)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
