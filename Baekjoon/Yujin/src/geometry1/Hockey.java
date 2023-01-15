package geometry1;

import java.util.Scanner;

public class Hockey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int p = scanner.nextInt();

        int answer = 0;
        for (int i = 0; i < p; i++) {
            int playerLocX = scanner.nextInt();
            int playerLocY = scanner.nextInt();

            if (Math.abs(playerLocX - x) + Math.abs((playerLocY - (y + (h / 2)))) <= Math.abs((h / 2)) && playerLocX < x) {
                answer++;
            } else if (playerLocX >= x && playerLocX <= (x + w) && playerLocY >= y && playerLocY <= (y + h)) {
                answer++;
            } else if (Math.abs(playerLocX - (x + w)) + Math.abs((playerLocY - (y + (h / 2)))) <= Math.abs((h / 2)) && playerLocX > x + w) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
