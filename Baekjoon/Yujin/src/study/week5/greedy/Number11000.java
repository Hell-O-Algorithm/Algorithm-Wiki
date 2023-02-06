package study.week5.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number11000 {
    static Lecture[] lectureList;
    static int answer;

    static int lectureCount;

    static class Lecture {
        int startTime;
        int endTime;

        public Lecture(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return "Lecture{" +
                    "startTime=" + startTime +
                    ", endTime=" + endTime +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        lectureCount = Integer.parseInt(br.readLine());

        lectureList = new Lecture[lectureCount];

        for (int i = 0; i < lectureCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());

            lectureList[i] = new Lecture(startTime, endTime);
        }

        Arrays.sort(lectureList, new Comparator<Lecture>() {
            @Override
            public int compare(Lecture o1, Lecture o2) {
                if (o1.startTime == o2.startTime) {
                    return o1.endTime - o2.endTime;
                }
                return o1.startTime - o2.startTime;
            }
        });
        // 강의 시작시간 순으로 정렬
        // 만약 강의 시작시간이 같다면, 끝나는 시간 순으로 정렬

        Greedy();

        System.out.println(answer);
    }

    public static void Greedy() {
        Queue<Integer> queue = new PriorityQueue<>();
        // 강의 끝나는 시간 저장
        queue.add(lectureList[0].endTime);

        for (int i = 1; i < lectureCount; i++) {
            int queueEndTime = queue.peek();
            if (lectureList[i].startTime >= queueEndTime) {
                queue.poll();
            }
            queue.add(lectureList[i].endTime);

        }
        answer = queue.size();
    }
}
