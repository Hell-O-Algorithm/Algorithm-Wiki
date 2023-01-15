package sort;

import java.util.*;

public class WordSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < count; i++) {
            wordSet.add(scanner.next());
        }
        String[] wordArray = new String[wordSet.size()];

        wordArray = wordSet.toArray(new String[0]);

        Arrays.sort(wordArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() != o2.length() ? o1.length() - o2.length() : o1.compareTo(o2);
            }
        });

        // answer print
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println(wordArray[i]);
        }
    }
}
