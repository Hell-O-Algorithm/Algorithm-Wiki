package setandmap;

import java.util.HashSet;
import java.util.Scanner;

public class MinusSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aCount = scanner.nextInt();
        int bCount = scanner.nextInt();

        HashSet<Integer> aSet = new HashSet<>();
        HashSet<Integer> bSet = new HashSet<>();

        for (int i = 0; i < aCount; i++) {
            aSet.add(scanner.nextInt());
        }

        for (int i = 0; i < bCount; i++) {
            bSet.add(scanner.nextInt());
        }

        int count = 0;
        for (Integer number : aSet) {
            if (bSet.contains(number)) {
                count++;
            }
        }

        for (Integer number : bSet) {
            if (aSet.contains(number)) {
                count++;
            }
        }
        System.out.println((aSet.size() + bSet.size()) - count);
    }
}
