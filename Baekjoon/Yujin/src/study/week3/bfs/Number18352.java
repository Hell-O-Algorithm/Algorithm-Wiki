package study.week3.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number18352 {

    static int cityCount;
    static int roadCount;
    static int roadLenInfo;
    static int startCityNum;

    static int[] shortestRoad = new int[300_001];

    static List<ArrayList<Integer>> cityGraph = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        cityCount = Integer.parseInt(st.nextToken());
        roadCount = Integer.parseInt(st.nextToken());
        roadLenInfo = Integer.parseInt(st.nextToken());
        startCityNum = Integer.parseInt(st.nextToken());

        for (int i = 0; i < cityCount + 1; i++) {
            cityGraph.add(new ArrayList<>());
            shortestRoad[i] = -1;
        }

        for (int i = 0; i < roadCount; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            cityGraph.get(x).add(y);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startCityNum);
        shortestRoad[startCityNum] = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 0; i < cityGraph.get(now).size(); i++) {
                int next = cityGraph.get(now).get(i);

                if (shortestRoad[next] == -1) {
                    shortestRoad[next] = shortestRoad[now] + 1;
                    queue.offer(next);
                }

            }
        }

        boolean isExistShortestRoad = false;
        for (int i = 0; i < cityCount + 1; i++) {
            if (shortestRoad[i] == roadLenInfo) {
                System.out.println(i);
                isExistShortestRoad = true;
            }
        }
        if (!isExistShortestRoad) {
            System.out.println(-1);
        }
    }
}
