package setandmap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberCardsTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getCardNumber = scanner.nextInt();
        HashMap<Integer, Integer> getCardMap = new HashMap<>();

        for (int i = 0; i < getCardNumber; i++) {
            int cardNum = scanner.nextInt();
            if(getCardMap.containsKey(cardNum)){
                getCardMap.put(cardNum, (getCardMap.get(cardNum) + 1));

            }else{
                getCardMap.put(cardNum, 1);
            }
        }

        int findCardNumber = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < findCardNumber; i++) {
            int findNum = scanner.nextInt();
            if(getCardMap.containsKey(findNum)){
                sb.append(getCardMap.get(findNum));
            }else{
                sb.append(0);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
