import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String [] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for (int i = 0; i<strArr.length; i++) {
            if (str.contains(strArr[i])) {
                str = str.replace(strArr[i], "!");
            }
        }
        System.out.println(str.length());
    }
}