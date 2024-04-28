import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int credit = 0;
        double sum = 0;


        for(int i = 0; i < 20; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");

            String Subject = st.nextToken();
            double A = Double.parseDouble(st.nextToken());
            String B = st.nextToken();

            if (B.equals("A+")) {
                B = B.replace("A+", "4.5");
            }if (B.equals("A0")) {
                B = B.replace("A0", "4.0");
            }if (B.equals("B+")) {
                B = B.replace("B+", "3.5");
            }if (B.equals("B0")) {
                B = B.replace("B0", "3.0");
            }if (B.equals("C+")) {
                B = B.replace("C+", "2.5");
            }if (B.equals("C0")) {
                B = B.replace("C0", "2.0");
            }if (B.equals("D+")) {
                B = B.replace("D+", "1.5");
            }if (B.equals("D0")) {
                B = B.replace("D0", "1.0");
            }if (B.equals("F")) {
                B = B.replace("F", "0.0");
            }if (B.equals("P")) {
                B = B.replace("P", "0.0");
                A = 0;
            }
            credit += A;

            sum += A * (Double.parseDouble(B));
        }

        System.out.printf("%.6f", sum / credit);

    }
}