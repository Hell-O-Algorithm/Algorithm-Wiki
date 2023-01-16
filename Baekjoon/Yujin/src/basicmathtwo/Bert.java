package basicmathtwo;

import java.util.Scanner;

public class Bert {

    public static boolean[] numArray = new boolean[246913];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            Decimal(number);
        }
    }

    public static void Decimal(int num) {
        int doubleNum = (num * 2);
        numArray[0] = numArray[1] = true;

        for (int i = 2; i <= Math.sqrt(numArray.length); i++) {
            if (numArray[i]) {
                continue;
            }
            for (int j = i * i; j < numArray.length; j += i) {
                numArray[j] = true;
            }
        }
        int count = 0;
        for (int i = num+1; i <= doubleNum; i++) {
            if (!numArray[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

}
