import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int [9][9];

        int max = arr[0][0];
        int A = 0;
        int B = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int l = 0; l < 9; l++) {
                arr[i][l] = Integer.parseInt(st.nextToken());

                if (arr[i][l] >= max) {
                    max = arr[i][l];
                    A = i+1;
                    B = l+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(A + " " + B);

    }
}