package setandmap;

import java.util.*;

public class NoHear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noHearNumber = scanner.nextInt();
        int noSeeNumber = scanner.nextInt();
        HashSet<String> noHearSet = new HashSet<>();
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < noHearNumber; i++) {
            noHearSet.add(scanner.next());
        }

        int count = 0;
        for (int i = 0; i < noSeeNumber; i++) {
            String name = scanner.next();
            if (noHearSet.contains(name)) {
                answer.add(name);
                count++;
            }
        }

        Collections.sort(answer);
        System.out.println(count);
        for(String name : answer){
            System.out.println(name);
        }
    }
}
