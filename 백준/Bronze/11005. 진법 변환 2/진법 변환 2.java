import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int tmp = 0;

        StringBuilder result = new StringBuilder();

        while (A > 0) {
            tmp = A % B;
            if (tmp >= 10) {
                char c = (char)(tmp + 55);
                result.append(c);
            } else {
                result.append(tmp);
            }
            A = A / B;
        }
        System.out.println(result.reverse().toString());  
    }
}
