import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = N; i >= 0; i--) {
            String str = i + "";
            int sum = 0;

            for (int l = str.length()-1; l >= 0; l--) {
                sum += Integer.parseInt(str.charAt(l)+"");
            }

            if (N==sum+i) {
                arrayList.add(i);
            }
        }

        if (arrayList.size()==0) System.out.println(0);
        else System.out.println(arrayList.get(arrayList.size()-1));
    }
}