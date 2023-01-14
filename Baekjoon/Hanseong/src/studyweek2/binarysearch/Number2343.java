package studyweek2.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2343 {

    static int N, M;
    static int[] arr;
    static int low, high;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            high += arr[i];
            low = Math.max(low, arr[i]);
        }
        binarySearch();

        System.out.println(low);

    }

    private static void binarySearch() {
        int mid, sum, count;

        while (low <= high) {
            mid = (low + high) / 2;
            sum = 0;
            count = 0;

            for (int i = 0; i < N; i++) {
                if (sum + arr[i] > mid) {
                    sum = 0;
                    count++;
                }

                sum += arr[i];
            }

            if (sum > 0) count++;
            if (count <= M) high = mid - 1;
            else low = mid + 1;

        }
    }
}