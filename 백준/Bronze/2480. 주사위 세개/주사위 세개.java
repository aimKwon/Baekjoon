import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] Array = new int [3];

        for(int i = 0; i < 3; i++) {
            Array[i] = sc.nextInt();
        }

        int A = Array[0];
        int B = Array[1];
        int C = Array[2];

        sc.close();

        if (A == B && B == C) {
            System.out.println(10000+(A*1000));
        } else if (A == B || B == C) {
            System.out.println(1000+ (B)*100);

            } else if (A == C) {
            System.out.println(1000+ (C)*100);

        } else if (A!=B && B!=C && C!=A) {
            Arrays.sort(Array);
            System.out.println(Array[2]*100);
        }
    }
}
