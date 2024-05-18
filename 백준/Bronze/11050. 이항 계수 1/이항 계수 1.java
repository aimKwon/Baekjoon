import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int A = 1;
        for (int i = 1; i <= K; i++) {
            A *= N;
            N--;
        }

        int B = 1;
        for (int i = 1; i <= K; i++) {
            B *= i;
        }

        System.out.println(A / B);
    }
}