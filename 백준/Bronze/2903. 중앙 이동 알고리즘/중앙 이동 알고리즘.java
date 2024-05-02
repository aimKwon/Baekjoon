import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = 2;

        for (int i = 1; i <= N; i++) {
            M = (M-1) + M;
        }

        System.out.println(M*M);
    }
}