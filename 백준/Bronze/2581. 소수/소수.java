import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = M; i <= N; i++) {
            Boolean filter = true;
            if (i == 1) {
                filter = false;
            }

            for (int l = 2; l < i; l++) {
                if (i % l == 0) {
                    filter = false;
                    break;
                }
            }

            if (filter) {
                arrayList.add(i);
            }
        }
        
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(arrayList.get(0));
        }

    }
}