package basicmathtwo;

import java.util.Scanner;

public class GoldBagh {

    public static boolean[] decimal = new boolean[20001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Erathos();

        int count = scanner.nextInt();
        while(count --> 0) {
            int num = scanner.nextInt();
            GoldBagh(num);
        }
    }

    public static void GoldBagh(int num) {
        int range = (num / 2);

        for (int i = range; i >= 2; i--) {
            for (int j = i; j < num - 1; j++) {
                if (!decimal[i] && !decimal[j]) {
                    if (i + j == num) {
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }
    }

    public static void Erathos() {
        decimal[0] = decimal[1] = true;
        for (int i = 2; i < Math.sqrt(decimal.length); i++) {
            if (decimal[i]) {
                continue;
            }

            for (int j = i * i; j < decimal.length; j += i) {
                decimal[j] = true;
            }
        }
    }
}
