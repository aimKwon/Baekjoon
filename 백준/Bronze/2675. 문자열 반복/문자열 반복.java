import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());



        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int R = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String result = "";

            for (int l = 0; l < str.length(); l++) {
                for (int m = 0; m < R; m++) {
                    result += str.charAt(l)+"";
                }
            }
            System.out.println(result);
        }
    }
}