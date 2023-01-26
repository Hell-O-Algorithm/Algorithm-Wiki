package com.example.demo.boj;

import com.example.demo.algorithm.MyDFS;

import java.util.*;
import java.util.stream.Stream;
import java.io.*;

public class Boj1260 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputArr1 = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = inputArr1[0];
        int m = inputArr1[1];
        int v = inputArr1[2];

        int[][] adjacencyMatrix = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int[] inputArr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacencyMatrix[inputArr[0]][inputArr[1]] = 1;
            adjacencyMatrix[inputArr[1]][inputArr[0]] = 1;
        }
        MyDFS dfs = new MyDFS(n, v, adjacencyMatrix);
        System.out.println();
        MyBFS bfs = new MyBFS(n, v, adjacencyMatrix);
    }

}

