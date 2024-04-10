import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] Array = new int [N];

        for (int i = 0; i < N; i++) {
            Array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(Array);

        for (int a : Array) {
            System.out.println(a);
        }


    }
}
