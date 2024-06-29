import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String result = "";

        for (int l =str.length()-1; l >= 0; l--) {
            result += str.charAt(l);
        }

        if (str.equals(result)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
