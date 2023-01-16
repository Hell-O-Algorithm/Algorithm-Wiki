package numbertheory;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int firstNum = scanner.nextInt();
            int secNum = scanner.nextInt();

            if (firstNum == 0 && secNum == 0) {
                break;
            }

            checkNum(firstNum, secNum);
        }
    }

    public static void checkNum(int firstNum, int secNum) {
        if (secNum % firstNum == 0) {
            System.out.println("factor");
        } else if (firstNum % secNum == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("neither");
        }
    }
}
