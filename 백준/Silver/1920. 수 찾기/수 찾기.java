import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] Narr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Narr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Narr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = Narr.length-1;

            while(start <= end) {
                int mid_index = (start+end) / 2;
                int mid_value = Narr[mid_index];

                if (mid_value > target) {
                    end = mid_index - 1;
                } else if (mid_value < target) {
                    start = mid_index + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}