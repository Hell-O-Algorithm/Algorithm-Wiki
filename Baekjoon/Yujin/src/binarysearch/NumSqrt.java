package binarysearch;

import java.io.*;

public class NumSqrt {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째줄에 정수 n이 주어진다
        // q^2 >= n 인 가장 작은 음이 아닌 정수 q를 출력
        long num = Long.parseLong(br.readLine());
        bw.write(String.valueOf(getNum(num)));
        bw.flush();
    }

    public static long getNum(long num) {
        long answer = (long) Math.sqrt(num);
        if (Math.pow(answer, 2) >= num) {
            return answer;
        }
        return (answer + 1);
    }
}
