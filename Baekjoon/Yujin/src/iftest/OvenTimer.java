package iftest;

import java.util.Scanner;

public class OvenTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int time = scanner.nextInt();

        minute += time;

        if (minute >= 60) {
            hour += minute/60;
            minute -= minute/60 * 60;
        }

        if (hour >= 24) {
            hour -= 24;
        }

        System.out.println(hour + " " + minute);
    }
}
