package geometry1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OutRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        List<Integer> numList = new ArrayList<>();

        int lengthXOne = w - x;
        int lengthXTwo = x - 0;
        int lengthYOne = y - 0;
        int lengthYTwo = h - y;

        numList.add(lengthXOne);
        numList.add(lengthXTwo);
        numList.add(lengthYOne);
        numList.add(lengthYTwo);

        System.out.println(Collections.min(numList));

    }
}
