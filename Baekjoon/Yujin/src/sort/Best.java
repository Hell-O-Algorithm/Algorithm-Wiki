package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Best {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            list.add(num);
            sum += num;
        }

        Collections.sort(list);

        System.out.println(sum/5);
        System.out.println(list.get(2));
    }
}
