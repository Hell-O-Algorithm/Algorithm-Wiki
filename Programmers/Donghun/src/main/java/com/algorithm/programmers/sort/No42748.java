package com.algorithm.programmers.sort;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

@Component
public class No42748 {
    public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[][] commands = new int[m][3];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                commands[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//        int[] answer = solution1(array, commands);
        int[] answer = solution2(array, commands);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            List<Integer> listTmp = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                listTmp.add(array[j]);
            }
            listTmp.sort(Comparator.naturalOrder());
            answer[i] = listTmp.get(commands[i][2] - 1);

        }
        return answer;
    }

    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] arrayTmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arrayTmp);
            answer[i] = arrayTmp[commands[i][2] - 1];
        }
        return answer;
    }
}
