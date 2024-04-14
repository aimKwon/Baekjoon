import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Array = new int[30];

        for (int i = 0; i < 30; i++) {
            Array[i] = i+1;
        }

        for (int i = 0; i <28; i++) {
        int A = Integer.parseInt(br.readLine());
            for (int l = 0; l < 30; l++) {
                if (Array[l] == A) {
                    Array[l] = 0;
                }
            }
        }

        for (int i = 0; i < 30; i++) {
            if(Array[i] != 0) {
                System.out.print(Array[i] +" ");
            }
        }
    }
}
