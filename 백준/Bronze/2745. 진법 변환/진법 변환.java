import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String A = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int result = 0;

        for (int i = A.length()-1; i >= 0; i--) {
            char c = A.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (c - 55) * tmp;
            } else {
                result += (c - 48) * tmp;
            }
            tmp *= B;
        }

        System.out.println(result);
    }
}