package setandmap;

import java.util.HashSet;
import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            String partStr = "";
            for (int j = i; j < str.length(); j++) {
                partStr += str.substring(j, j + 1);
                set.add(partStr);
            }
        }
        System.out.println(set.size());
    }
}
