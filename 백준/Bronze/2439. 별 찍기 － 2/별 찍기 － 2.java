import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String star = "";

        for (int i = 1; i <= N; i++) {
        String blank = "";
            for (int l = N-i; l >= 1; l--) {
                blank += " ";
            }
            star += "*";
            System.out.println(blank+star);
        }
    }
}
