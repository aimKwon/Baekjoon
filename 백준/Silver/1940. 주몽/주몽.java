import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start_idx = 0;
        int end_idx = N - 1;
        int count = 0;

        while (start_idx < end_idx) {

            if (arr[start_idx] + arr[end_idx] > M) {
                end_idx = end_idx - 1;

            } else if (arr[start_idx] + arr[end_idx] < M) {
                    start_idx = start_idx + 1;
            } else {
                count++;
                start_idx = start_idx + 1;
            }
        }
        System.out.println(count);
    }
}