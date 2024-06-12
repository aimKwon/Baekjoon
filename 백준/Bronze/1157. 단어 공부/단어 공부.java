import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }
        
        int max = 0;
        for (int i = 1; i < 26; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[max] == arr[i]) {
                count++;
            }
        }

        if (count >= 2) {
            System.out.println("?");
        } else {
            System.out.println((char)(max + 'A'));
        }
    }
}