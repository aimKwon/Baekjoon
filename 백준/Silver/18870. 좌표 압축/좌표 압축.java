import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] orginArr = new int[N];
        int[] countArr = new int[N];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            orginArr[i] = countArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(countArr);

        int rank = 0;
        for (int v : countArr) {
            if (!hashMap.containsKey(v)) {
                hashMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : orginArr) {
            int ranking = hashMap.get(key);
            sb.append(ranking).append(" ");
        }

        System.out.println(sb);
    }
}