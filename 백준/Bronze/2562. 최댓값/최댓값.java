import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Max = Integer.parseInt(br.readLine());
        int Index = 1;
        int MIndex = 1;

        for(int i = 0; i < 8; i++) {
            Index ++;
            int N = Integer.parseInt(br.readLine());
            if (N > Max) {
               Max = N;
               MIndex = Index;
            }
        }
        
        System.out.println(Max);
        System.out.println(MIndex);
    }
}
