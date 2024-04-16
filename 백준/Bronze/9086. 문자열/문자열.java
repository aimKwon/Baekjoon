import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String st = br.readLine();

            String A = st.charAt(0) + "";
            String B = st.charAt(st.length()-1) + "";

            System.out.println(A+B);
        }
    }
}
