package study.week5.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number2872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bookCount = Integer.parseInt(br.readLine());
        List<Integer> bookList = new ArrayList<>();

        for (int i = 0; i < bookCount; i++) {
            bookList.add(Integer.parseInt(br.readLine()));
        }
        Collections.reverse(bookList);

        int max = bookCount;
        int answer = 0;
        for (int i = 0; i<bookCount; i++) {
            int bookNum = bookList.get(i);
            if (max == bookNum) {
                max -= 1;
            } else {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}
