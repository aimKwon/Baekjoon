import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            if (n==-1) {
                break;
            }

            ArrayList<Integer> arrayList = new ArrayList();

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    arrayList.add(i);
                }
            }
            int sum = 0;

            for (int l = 0; l < arrayList.size()-1; l++) {
                sum += arrayList.get(l);
            }
                if (n==sum) {
                    System.out.print(n + " = ");
                    for (int m = 0; m < arrayList.size()-1; m++) {
                        if (m == 0) {
                            System.out.print(arrayList.get(m));
                        } else if( m >= 1) {
                            System.out.print(" + ");
                            System.out.print(arrayList.get(m));
                        }
                    }
                        System.out.println();
                } else {
                    System.out.println(n + " is NOT perfect.");
                }
        }
    }
}