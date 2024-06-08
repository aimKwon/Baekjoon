import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] aArray = new double[N];
        double[] bArray = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            aArray[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(aArray);
        double sum = 0;
        for (int i = 0; i < N; i++) {
            bArray[i] = (aArray[i] * 100) / aArray[aArray.length - 1];
            sum += bArray[i];
        }
        double result = sum / N;

        System.out.println(result);
    }
}