import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int [4];

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());

            arr[0] = M / 25;
            arr[1] = (M % 25) / 10;
            arr[2] = ((M % 25) % 10) / 5;
            arr[3] = (((M % 25) % 10)) % 5;

            for (int e : arr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}