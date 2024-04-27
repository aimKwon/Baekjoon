import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            int B = A % 42;

            hashSet.add(B);
        }
        System.out.println(hashSet.size());
    }
}