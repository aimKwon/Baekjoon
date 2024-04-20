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
        int C = Integer.parseInt(st.nextToken());

        int[] Array = new int[3];
        Array[0] = A;
        Array[1] = B;
        Array[2] = C;

        if (A==B && B==C) {
            System.out.println((A*1000)+10000);
        } else if (A==B || B==C) {
            System.out.println((100*B)+1000);
        } else if (A==C) {
            System.out.println((100*A)+1000);
        } else if (A!=B && B!=C) {
            Arrays.sort(Array);
            System.out.println(Array[2]*100);
        }

    }
}