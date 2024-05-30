import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<Integer> hashSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            hashSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < B; i++) {
            hashSet.add(Integer.parseInt(st.nextToken()));
        }

        int result = (A + B - hashSet.size()) * 2;
        
        System.out.println(A + B - result);
    }
}