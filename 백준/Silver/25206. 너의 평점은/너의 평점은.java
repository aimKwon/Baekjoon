import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> map = new HashMap<>();

        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        ArrayList<Double> arrayList = new ArrayList();

        double grade = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String A = st.nextToken();
            double B = Double.parseDouble(st.nextToken());
            String C = st.nextToken();


            switch (C) {

                case "A+":
                    arrayList.add(B * (map.get(C)));
                    grade += B;
                    break;

                case "A0":
                    arrayList.add(B * (map.get(C)));
                    grade += B;
                    break;

                case "B+":
                    arrayList.add(B * (map.get(C)));
                    grade += B;
                    break;

                case "B0":
                    arrayList.add(B * (map.get(C)));
                    grade += B;
                    break;

                case "C+":
                    arrayList.add(B * (map.get(C)));
                    grade += B;
                    break;

                case "C0":
                    arrayList.add(B * (map.get(C)));
                    grade += B;
                    break;

                case "D+":
                    arrayList.add(B * (map.get(C)));
                    grade += B;
                    break;

                case "D0":
                    arrayList.add(B * (map.get(C)));
                    grade += B;
                    break;

                case "F":
                    arrayList.add(B * (map.get(C)));
                    grade += B;
                    break;

                case "P":
                    break;
            }

        }

        double sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        System.out.println(sum / grade);
    }
}