import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean primeNumbers[] = new boolean[M+1];

        primeNumbers[0] = true;
        primeNumbers[1] = true;

        for (int i = 2; i < Math.sqrt(primeNumbers.length); i++) {
            if (!primeNumbers[i]) {

                for (int j = i * i; j <= M; j += i) {
                    primeNumbers[j] = true;
                }
            }
        }

        for (int i = 2; i < N; i++) {
            primeNumbers[i] = true;
        }

        for (int i = 0; i < primeNumbers.length; i++) {
            if (!primeNumbers[i]) System.out.println(i);
        }
    }
}