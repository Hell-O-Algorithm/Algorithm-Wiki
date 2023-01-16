package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toUpperCase();
        List<Character> wordList = new ArrayList<>();
        Character result = null;

        for (Character character : word.toCharArray()) {
            wordList.add(character);

        }

        Map<Character, Integer> wordCount = new HashMap<>();
        for (Character character : wordList) {
            wordCount.put(character, wordCount.getOrDefault(character, 0) + 1);
        }

        Integer max = Collections.max(wordCount.values());
        int count = 0;

        for (Character character : wordCount.keySet()) {
            if (max.equals(wordCount.get(character))) {
                result = character;
                count++;
            }
            if (count >= 2) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
