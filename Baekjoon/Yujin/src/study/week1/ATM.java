package study.week1;

import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> atmList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            atmList.add(scanner.nextInt());
        }

        Collections.sort(atmList);

        int time = 0;
        int len = atmList.size();
        for (int i = 0; i < len; i++) {
            time += atmList.get(i) * (len - i);
        }

        System.out.println(time);
    }
}
