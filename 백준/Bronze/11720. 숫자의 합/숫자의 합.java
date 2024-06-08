import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strArr = str.split("");
        int result = 0;

        for(int i = 0; i < strArr.length; i++){
            result += Integer.parseInt(strArr[i]);
        }
        System.out.println(result);
    }
}