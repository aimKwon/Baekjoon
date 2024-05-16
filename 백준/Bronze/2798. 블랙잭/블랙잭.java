import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = findMax(arr, N, M);

        System.out.println(result);
    }

    private static int findMax(int[] arr, int N, int M) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int a = 0; a < N-2; a++) {
            for (int b = a+1; b < N-1; b++) {
                for (int c = b+1; c < N; c++) {
                    int sum = arr[a] + arr[b] + arr[c];
                    if (sum <= M) arrayList.add(sum);
                }
            }
        }

        int max = arrayList.get(0);
        
        for (int i = 1; i < arrayList.size(); i++) {
            if(arrayList.get(i) > max) max = arrayList.get(i);
        }

       return max;
    }
}