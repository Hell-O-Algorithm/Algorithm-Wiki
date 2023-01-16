package numbertheory;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int firstNum = scanner.nextInt();
            int secNum = scanner.nextInt();

            getLcm(firstNum, secNum);
        }
    }

    public static void getLcm(int firstNum, int secNum) {
        // 유클리드 호제법으로 최대공약수 구하기
        int originFirstNum = firstNum;
        int originSecNum = secNum;
        int r = 1;

        while (secNum > 0) {
            r = firstNum % secNum;
            firstNum = secNum;
            secNum = r;
        }
        int gcd = firstNum;

        // 최소공배수 구하기
        int lcm = (originFirstNum * originSecNum) / gcd;

        System.out.println(lcm);
    }
}
