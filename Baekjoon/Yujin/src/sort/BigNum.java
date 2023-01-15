package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            numList.add(scanner.nextInt());
        }

        Collections.sort(numList);

        System.out.println(numList.get(1));
    }
}
