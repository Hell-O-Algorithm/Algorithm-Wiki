package binarysearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class If {
    static List<Character> characterList = new ArrayList<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String message = st.nextToken();
            long power = Long.parseLong(st.nextToken());
            characterList.add(new Character(message, power));
        }

        for (int i = 0; i < m; i++) {
            long num = Long.parseLong(bf.readLine());
            binarySearch(0, n - 1, num);
        }
        bw.flush();
    }

    public static class Character {
        String message;
        long power;

        public Character(String message, long power) {
            this.message = message;
            this.power = power;
        }
    }

    public static void binarySearch(int left, int right, long num) throws IOException {
        String answer = "";
        while (left <= right) {
            int mid = (left + right) / 2;
            if (num <= characterList.get(mid).power) {
                right = mid - 1;
            } else if (num > characterList.get(mid).power) {
                left = mid + 1;
            }
            answer = characterList.get(left).message;
        }
        bw.write(answer + "\n");
    }
}


