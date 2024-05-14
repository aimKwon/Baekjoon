import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer>[] arrayList;
    static int[] check;
    static boolean[] visited;
    static boolean IsEven;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        for (int t = 0; t < testCase; t++) {
            String[] s = br.readLine().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            arrayList = new ArrayList[V+1];
            visited = new boolean[V+1];
            check = new int[V+1];
            IsEven = true;
            for (int i = 1; i <= V; i++) {
                arrayList[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < E; i++) {
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                arrayList[start].add(end);
                arrayList[end].add(start);
            }
            for (int i = 1; i <= V; i++) {
                if (IsEven) {
                    DFS(i);
                } else {
                    break;
                }
            }
            if (IsEven) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static void DFS(int start) {
        visited[start] = true;
        for (int i : arrayList[start]) {
            if (!visited[i]) {
               check[i] = (check[start] + 1) % 2;
               DFS(i);
            } else if(check[start]==check[i]) {
                    IsEven = false;
            }
        }
    }
}