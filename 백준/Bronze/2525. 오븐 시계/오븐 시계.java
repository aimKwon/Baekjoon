import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();

        int T = (A*60) + B + C;

        A = (T / 60) % 24;
        B = (B + C) % 60;

       System.out.println(A+" "+B);
    }
}
