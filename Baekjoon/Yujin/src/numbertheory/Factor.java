package numbertheory;

import java.util.*;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorCount = scanner.nextInt();
        List<Integer> factors = new ArrayList<>();

        for (int i = 0; i < factorCount; i++) {
            factors.add(scanner.nextInt());
        }

        int answer = (Collections.max(factors) * Collections.min(factors));
        System.out.println(answer);
    }
}
