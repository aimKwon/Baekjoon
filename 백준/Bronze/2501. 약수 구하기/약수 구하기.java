import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        ArrayList<Integer> arrayList = new ArrayList<>();

        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken())-1;

        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                arrayList.add(i);
            }
        }

        try {
            System.out.println(arrayList.get(q));
        } catch (Exception e) {
            System.out.println("0");
        }
    }
}