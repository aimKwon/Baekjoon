import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] Arr = new int[A];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < A; i++) {
            Arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Arr);

        System.out.println(Arr[Arr.length-B]);
    }
}