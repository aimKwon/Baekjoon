import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine())-1;
        ArrayList<String> arrayList = new ArrayList();

        int number = 0;

        while (true) {
            number++;
            String element = number + "";
            if (element.contains("666")) {
                arrayList.add(element);
            }
            if (arrayList.size() > N) {
                System.out.println(arrayList.get(N));
                break;
            }
        }
    }
}