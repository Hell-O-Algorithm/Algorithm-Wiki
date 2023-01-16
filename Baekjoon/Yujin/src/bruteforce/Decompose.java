package bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decompose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        Decompose(num);
    }

    public static void Decompose(String num) {
        int answer = 0;
        for (int i = 1; i < Integer.parseInt(num); i++) {
            int sum = 0;
            String number = Integer.toString(i);
            for (int j = 0; j < number.length(); j++) {
                sum += Character.getNumericValue(number.charAt(j));
            }
            if (sum + i == Integer.parseInt(num)) {
                answer = i;
                System.out.println(answer);
                return;
            }
        }
        System.out.println(answer);
    }

}
