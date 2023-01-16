package numbertheory;

import java.util.Scanner;

public class GdcAndLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secNum = scanner.nextInt();

        // 최대공약수는 유클리드 호제법으로 구할 수 있음
        int gdc = getGdc(firstNum, secNum);
        int lcm = (firstNum * secNum) / gdc;

        System.out.println(gdc);
        System.out.println(lcm);
    }

    public static int getGdc(int firstNum, int secNum) {
        int r = 1;

        while (secNum > 0) {
            r = firstNum % secNum;
            firstNum = secNum;
            secNum = r;
        }

        return firstNum;
    }
}
