import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[A][B];

        for (int i = 0; i < A; i++) {
            st = new StringTokenizer(br.readLine());
            for (int l = 0; l < B; l++) {
                arr[i][l] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A; i++) {
            st = new StringTokenizer(br.readLine());
            for (int l = 0; l < B; l++) {
                sb.append(arr[i][l] + Integer.parseInt(st.nextToken()) + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}