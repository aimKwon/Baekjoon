import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B >= 45) {
            System.out.println(A+" "+(B-45));
        } else {
            B = 60 + B - 45;
            if (A == 0) {
                System.out.println(23+" "+B);
            } else {
                System.out.println(A-1+" "+B);
            }
        }

    }
}
