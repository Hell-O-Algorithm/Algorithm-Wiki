package bruteforce;

import java.util.Scanner;

public class Shun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Shun(num);

    }

    public static void Shun(int num) {
        int answer = 666;
        int count = 1;

        while (count != num) {
            answer ++;
            if (String.valueOf(answer).contains("666")) {
                count++;
            }
        }
        System.out.println(answer);
    }
}
