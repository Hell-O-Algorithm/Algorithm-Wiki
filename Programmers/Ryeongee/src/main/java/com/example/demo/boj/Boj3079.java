public class Boj3079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);
        int[] arr = new int[n];
        int max_value = 0;

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            max_value = Math.max(max_value, arr[i]);
        }

        long left = 0L;
        long right = (max_value) * 1000000000L;

        long ans = 0L;
        while (left<= right){
            long mid = (left+right) / 2;
            long cnt = 0;
            for(int i=0;i<n;i++){
                cnt += (mid / arr[i]);

            }
            if(cnt >= m){
                ans = mid;
                right = mid-1;
            }  else if (cnt < m){
                left = mid +1;

            }
        }

        System.out.println(ans);

    }