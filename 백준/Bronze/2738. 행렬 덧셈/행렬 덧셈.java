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

        int[][] Aarr = new int[A][B];
        int[][] Barr = new int[A][B];

        for (int i = 0; i < A; i++) {
                st = new StringTokenizer(br.readLine());
            for (int l = 0; l < B; l++) {
                Aarr[i][l] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < A; i++) {
            st = new StringTokenizer(br.readLine());
            for (int l = 0; l < B; l++) {
                Barr[i][l] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < A; i++) {
            for (int l = 0; l < B; l++) {
                Aarr[i][l] = Aarr[i][l] + Barr[i][l];
            }
        }
        for (int i = 0; i < A; i++) {
            for (int l = 0; l < B; l++) {
                System.out.print(Aarr[i][l] + " ");
            }
            System.out.println();
        }
    }
}