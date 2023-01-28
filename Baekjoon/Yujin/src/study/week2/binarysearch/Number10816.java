package study.week2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Number10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cardCount = Integer.parseInt(br.readLine());

        Map<Integer, Integer> cardMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cardCount; i++) {
            int cardKey = Integer.parseInt(st.nextToken());
            if (cardMap.containsKey(cardKey)) {
                int cardValue = cardMap.get(cardKey) + 1;
                cardMap.put(cardKey, cardValue);
            } else {
                cardMap.put(cardKey, 1);
            }
        }

        int findCardCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < findCardCount; i++) {
            int findCardKey = Integer.parseInt(st.nextToken());
            if (cardMap.containsKey(findCardKey)) {
                sb.append(cardMap.get(findCardKey));
            }else{
                sb.append(0);
            }
            sb.append(" ");
        }

        System.out.print(sb);
    }
}
