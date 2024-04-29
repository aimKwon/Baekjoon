import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[100][100];
        
        for (int i = 0; i < N; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for (int l  = A; l < A+10; l++) {
                for (int m = B; m < B+10; m++) {
                    arr[m][l] = 1;

                }
            }
        }

        int result = 0;

        for (int i = 0; i < 100; i++) {
            for (int l =0; l < 100; l++) {
                if (arr[i][l] == 1) {
                    result += arr[i][l];
                }
            }
        }
        System.out.println(result);

    }
}