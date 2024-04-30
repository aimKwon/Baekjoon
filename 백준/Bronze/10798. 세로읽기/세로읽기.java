import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = new String[5];

        for (int i = 0; i < 5; i++) {
            strArr[i] = br.readLine();
        }

        int max = strArr[0].length();

        for (int i = 0; i < 5; i++) {
            if (strArr[i].length() > max) {
                max = strArr[i].length();
            }
        }

        for (int i = 0; i < 5; i++) {
            while (strArr[i].length() < max) {
                strArr[i] += "*";
            }
        }

        String[][] arr = new String[5][max];

        for (int i = 0; i < 5; i++) {
            for (int l = 0; l < max; l++) {
                arr[i][l] = strArr[i].charAt(l) + "";
            }
        }

        String result = "";

        for (int i = 0; i < max; i++) {
            for (int l = 0; l < 5; l++) {
                result += arr[l][i];
            }
        }
        
        result = result.replace("*", "");

        System.out.println(result);
    }
}