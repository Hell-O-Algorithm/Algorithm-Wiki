package study.week5.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1213 {
    static int[] alpha = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            alpha[ch - 65] += 1;
        }

        int oddCount = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] % 2 != 0) {
                oddCount += 1;
            }
        }

        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            Greedy();
        }
    }

    public static void Greedy() {
        String front = "";
        String mid = "";
        String end = "";

        for (int i = 0; i < alpha.length; i++) {
            front += Character.toString((char) (65 + i)).repeat(alpha[i]/2);
        }

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] % 2 != 0) {
                mid += ((char) (65 + i));
            }
        }

        String reversedFront = new StringBuffer(front).reverse().toString();
        end = reversedFront;

        System.out.println(front + mid + end);
    }
}

// 다른 풀이쓰..
