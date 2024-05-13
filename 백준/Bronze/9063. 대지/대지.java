import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

            int x_max = A;
            int x_min = A;

            int y_max = B;
            int y_min = B;

        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            
            if (C > x_max) x_max = C;
            if (C < x_min) x_min = C;

            if (D > y_max) y_max = D;
            if (D < y_min) y_min = D;
        }
        int x = x_max - x_min;
        int y = y_max - y_min;

        System.out.println(x*y);
    }
}