package setandmap;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCards2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getCardNumber = scanner.nextInt();
        int[] getCardArray = new int[getCardNumber];

        for (int i = 0; i < getCardNumber; i++) {
            getCardArray[i] = scanner.nextInt();
        }
        Arrays.sort(getCardArray);

        int comparisionCardNumber = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < comparisionCardNumber; i++) {
            sb.append(binarySearch(getCardArray, getCardNumber, scanner.nextInt())).append(" ");
        }
        System.out.println(sb);

    }

    public static int binarySearch(int[] cards, int getCardNumber, int search) {

        int left = 0;
        int right = getCardNumber - 1;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if (cards[mid] == search) {
                return 1;
            } else if (search < cards[mid]) {
                right = mid - 1;
            } else if (cards[mid] < search) {
                left = mid + 1;
            }
        }
        return 0;
    }
}
