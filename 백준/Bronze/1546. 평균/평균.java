import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] m = new int [n];

        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            if (m[i] > max) {
                max = m[i];
            }
                sum += m[i];
        }

        System.out.println(sum*100.0/max/n);
    }
}
