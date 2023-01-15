package string;

import java.util.HashSet;
import java.util.Scanner;

public class GroupWordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wordCount = scan.nextInt();

        int result = 0;

        for (int i = 0; i < wordCount; i++) {
            String word = scan.next();
            result += wordChecker(word);
        }

        System.out.println(result);
    }

    static int wordChecker(String word) {
        char[] wordArray = word.toCharArray();
        HashSet<Character> characterHashSet = new HashSet<>();

        char prev = ' ';
        boolean flag = false;

        for (int i = 0; i < wordArray.length; i++) {
            char now = wordArray[i]; // 현재 문자 저장

            if (prev != now) {
                if (!flag) {
                    flag = true;
                    prev = now;
                } else {
                    return 0;
                }
            }
        }

        return 1;
    }
}
