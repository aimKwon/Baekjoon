import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while(true) {
            if ((str=br.readLine()) == null) {
                br.close();
                break;
            }
            System.out.println(str);
        }
    }
}
