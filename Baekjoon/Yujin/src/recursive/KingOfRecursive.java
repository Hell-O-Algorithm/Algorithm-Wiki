package recursive;

import java.util.Scanner;

public class KingOfRecursive {
    public static void recursion(String s, int l, int r, int count) {
        count++;
        if (l >= r) { //글자 길이 1일 때 OR 끝까지 다 돌았을 때
            printAnswer(1, count);
        } else if (s.charAt(l) != s.charAt(r)) {
            printAnswer(0, count);
        } else {
            recursion(s, l + 1, r - 1, count);
        }
    }

    public static void isPalindrome(String s) {
        int count = 0;
        recursion(s, 0, s.length() - 1, count);
    }

    public static void printAnswer(int isPalindromeReturn, int countReturen) {
        System.out.println(isPalindromeReturn + " " + countReturen);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            isPalindrome(scanner.next());
        }
    }
}
