import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        for (int i = 1; i <= N; i++) {
            for (int l = 1; l <= N-i; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2*i-1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= N-1; i++) {
            for (int l = 1; l <= i; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2*N-1) - (2*i); m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}