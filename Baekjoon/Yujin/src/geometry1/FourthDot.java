package geometry1;

import java.util.*;
import java.util.Map.Entry;

public class FourthDot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> xMap = new HashMap<>();
        HashMap<Integer, Integer> yMap = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int count = 1;
            if (xMap.containsKey(x)) {
                count++;

            }
            xMap.put(x, count);

            count = 1;
            if (yMap.containsKey(y)) {
                count++;

            }
            yMap.put(y, count);

        }

        int xMin = Collections.min(xMap.values());
        int yMin = Collections.min(yMap.values());
        int xAnswer = 0;
        int yAnswer = 0;

        Set<Entry<Integer, Integer>> xEntrySet = xMap.entrySet();
        for (Entry<Integer, Integer> entry : xEntrySet) {
            if (entry.getValue().equals(xMin)) {
                xAnswer = entry.getKey();
            }
        }

        Set<Entry<Integer, Integer>> yEntrySet = yMap.entrySet();
        for (Entry<Integer, Integer> entry : yEntrySet) {
            if (entry.getValue().equals(yMin)) {
                yAnswer = entry.getKey();
            }
        }
        System.out.println(xAnswer + " " + yAnswer);

    }
}
