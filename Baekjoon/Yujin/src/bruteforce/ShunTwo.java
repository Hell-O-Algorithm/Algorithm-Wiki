package bruteforce;

import java.util.Scanner;

public class ShunTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ShunTwo(num);

    }

    public static void ShunTwo(int num) {
        int prevNum = 0;
        int lastNum = 0;
        int count = 1;
        int six = 666;
        int answer = 666;

        while (count != num) {
            prevNum +=1;
            if (String.valueOf(answer).charAt(0) == '6') {
                // answer 뒤에서 0 ~ 9 까지
                prevNum = 6;
                answer = Integer.parseInt(String.valueOf(six) + String.valueOf(lastNum));
                lastNum ++;

            } else {
                lastNum = 0;
                answer = Integer.parseInt( String.valueOf(prevNum) + String.valueOf(six));
            }
            count ++;
        }

        System.out.println(answer);
    }
}
