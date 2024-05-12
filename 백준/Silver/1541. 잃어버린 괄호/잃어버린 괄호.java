import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = str.split("-");

        int answer = 0;

        for (int i = 0; i < strArr.length; i++) {
            int temp = mySum(strArr[i]);
            if (i==0) {
                answer = answer + temp;
            } else {
                answer = answer - temp;
            }
        }
        System.out.println(answer);
    }

    private static int mySum(String str) {
        int sum = 0;

        String[] temp = str.split("[+]");

        for(int i = 0; i < temp.length; i++) {
            sum = sum + Integer.parseInt(temp[i]);
        }

        return sum;
    }
}