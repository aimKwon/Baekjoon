import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int newIndex = 1;
        int prevSum = 0;

        while (true) {
            if (N <= prevSum + newIndex) {
                if (newIndex % 2 == 0) {
                    System.out.println((N - prevSum) + "/" + (newIndex - (N - prevSum - 1)));
                    break;
                } else {
                    System.out.println((newIndex - (N - prevSum - 1)) + "/" + (N - prevSum));
                    break;
                }
            } else {
                prevSum += newIndex;
                newIndex++;
            }
        }
    }
}