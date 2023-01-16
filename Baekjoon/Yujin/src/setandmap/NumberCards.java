package setandmap;

import java.util.HashSet;
import java.util.Scanner;

public class NumberCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getCardNumber = scanner.nextInt();
        HashSet<Integer> getCardSet = new HashSet<>();

        for (int i = 0; i < getCardNumber; i++) {
            getCardSet.add(scanner.nextInt());
        }

        int comparisionCardNumber = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < comparisionCardNumber; i++) {
            if(getCardSet.contains(scanner.nextInt())){
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
