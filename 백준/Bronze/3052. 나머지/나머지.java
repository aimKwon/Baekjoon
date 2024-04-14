import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Array = new int [10];

        for (int i = 0; i < 10; i++) {
            int A = (Integer.parseInt(br.readLine())) % 42;
            Array[i] = A;
        }

        for (int i = 0; i < 9; i++) {
            for (int l = i+1; l< 10; l++) {
                if (Array[i] == Array[l]) {
                    Array[i] = -1;
                }
            }
        }

        int count = 10;

        for (int i =0; i< 10; i++) {
            if (Array[i]== -1) {
                count--;
            }
        }

        System.out.println(count);
    }
}
