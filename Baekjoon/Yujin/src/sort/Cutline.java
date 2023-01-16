package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cutline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int participant = scanner.nextInt();
        int awardCount = scanner.nextInt();

        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i < participant; i++) {
            scores.add(scanner.nextInt());
        }

        Collections.sort(scores);
        Collections.reverse(scores);

        System.out.println(scores.get(awardCount-1));
    }
}
