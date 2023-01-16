package geometry1;

import java.util.Scanner;

public class RightTiangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            isRightTriangle(a, b, c);
        }
    }

    public static void isRightTriangle(int a, int b, int c) {
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            System.out.println("right");
        } else if (Math.pow(a, 2) == Math.pow(c, 2) + Math.pow(b, 2)) {
            System.out.println("right");
        } else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}
