import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] Char = (br.readLine()).toCharArray();

        int result = 0;

        for (int i = 0; i < Char.length; i++) {
            result += Char[i] - '0';
        }

        System.out.println(result);
    }
}