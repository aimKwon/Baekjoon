import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] C =  br.readLine().toCharArray();
        int[] A = new int [C.length];

        for (int i = 0; i < C.length; i++) {
            A[i] = C[i] - '0';
        }

        for (int i = 0; i < A.length - 1; i++) {
            int Max = i;
            for (int j = i+1; j < A.length; j++) {
                if (A[j] > A[Max]) {
                    Max = j;
                }
            }
            if (A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }

        }
        for(int e : A) System.out.print(e);
    }
}
