import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);
        int[] arr = new int[n];
        int maxValue = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            maxValue = Math.max(maxValue, arr[i]);
        }

        long left = 0L;
        long right = (long) ((maxValue) * 10e9);

        long ans = 0L;
        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += (mid / arr[i]);

            }
            if (cnt >= m) {
                ans = mid;
                right = mid - 1;
            } else if (cnt < m) {
                left = mid + 1;

            }
        }

        System.out.println(ans);

    }
}