package setandmap;

import java.util.HashSet;
import java.util.Scanner;

public class StringSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int checkNumber = scanner.nextInt();

        HashSet<String> wordSet = new HashSet<>();
        for (int i = 0; i < number; i++) {
            wordSet.add(scanner.next());
        }

        int count = 0;
        for (int i = 0; i < checkNumber; i++) {
            if (wordSet.contains(scanner.next())) {
                count++;
            }
        }
        System.out.println(count);

    }
}
