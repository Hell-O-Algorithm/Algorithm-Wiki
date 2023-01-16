package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortInside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < number.length() ; i++) {
            numList.add(Integer.parseInt(String.valueOf(number.charAt(i))));
        }

        Collections.sort(numList, Collections.reverseOrder());

        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i));
        }
    }

}
