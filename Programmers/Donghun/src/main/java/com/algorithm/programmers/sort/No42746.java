package com.algorithm.programmers.sort;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

@Component
public class No42746 {
    public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

//        String answer = solution(numbers);
//        String answer = bubbleSort(numbers);
//        String answer = bubbleSortRev(numbers);
        String answer = comparatorSort(numbers);
        System.out.println("answer = " + answer);
    }

    public String bubbleSort(int[] numbers) {
        StringBuilder sb;
        String answer;
        int length = numbers.length;
        int index = 0;
        String[] stringNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        while (length > 1) {
            while (index != length - 1) {
                sb = new StringBuilder();
                int numA = Integer.parseInt(sb.append(stringNumbers[index]).append(stringNumbers[index + 1]).toString());
                sb = new StringBuilder();
                int numB = Integer.parseInt(sb.append(stringNumbers[index + 1]).append(stringNumbers[index]).toString());
                if (numA < numB) {
                    String tmp = stringNumbers[index];
                    stringNumbers[index] = stringNumbers[index + 1];
                    stringNumbers[index + 1] = tmp;
                }
                index++;
            }
            length--;
            index = 0;
        }
        if (stringNumbers[0].equals("0")) {
            answer = "0";
        } else {
            sb = new StringBuilder();
            for (String stringNumber : stringNumbers) {
                sb.append(stringNumber);
            }
            answer = sb.toString();
        }
        return answer;
    }

    public String bubbleSortRev(int[] numbers) {
        String answer = "0";
        int length = numbers.length;
        int index = 0;
        String[] stringNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        while (length > 1) {
            while (index != length - 1) {
                int numA = Integer.parseInt(stringNumbers[index] + stringNumbers[index + 1]);
                int numB = Integer.parseInt(stringNumbers[index + 1] + stringNumbers[index]);
                if (numA < numB) {
                    String tmp = stringNumbers[index];
                    stringNumbers[index] = stringNumbers[index + 1];
                    stringNumbers[index + 1] = tmp;
                }
                index++;
            }
            length--;
            index = 0;
        }
        if (!stringNumbers[0].equals("0")) {
            StringBuilder sb = new StringBuilder();
            for (String stringNumber : stringNumbers) {
                sb.append(stringNumber);
            }
            answer = sb.toString();
        }
        return answer;
    }

    public String comparatorSort(int[] numbers) {
        String answer = "0";
        String[] stringNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(stringNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        if (!stringNumbers[0].equals("0")) {
            StringBuilder sb = new StringBuilder();
            for (String stringNumber : stringNumbers) {
                sb.append(stringNumber);
            }
            answer = sb.toString();
        }
        return answer;
    }

    public String solution(int[] numbers) {
        String answer = "";
        int[][] numArray = new int[numbers.length][2];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int tmpNum = number;
            while (tmpNum / 10 != 0) {
                tmpNum = tmpNum / 10;
            }
            numArray[i][0] = tmpNum;
            numArray[i][1] = number;
        }
        Arrays.sort(numArray, (o1, o2) -> o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1]);
        System.out.println("numArray = " + Arrays.deepToString(numArray));
        return answer;
    }
}
