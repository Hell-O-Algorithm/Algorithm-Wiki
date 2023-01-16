package sort;

import java.util.*;

public class CoordinateAlzip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numArray = new int[count];
        int[] sortedArray = new int[count];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < count; i++) {
            numArray[i] = sortedArray[i] = scanner.nextInt();
        }
        Arrays.sort(sortedArray);

        int rank = 0;
        for(int sortNum : sortedArray){
            if(!map.containsKey(sortNum)){
                map.put(sortNum, rank);
                rank += 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : numArray) {
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb);
    }
}
