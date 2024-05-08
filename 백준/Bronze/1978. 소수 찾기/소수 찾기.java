import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(st.nextToken());
            if (M != 1) {
                int count = 0;
                for (int l = 2; l <= Math.sqrt(M); l++) {
                    if (M % l == 0) {
                        count ++;
                    }
                }
                if (count == 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}