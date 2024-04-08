import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int [] myArray;
    static int [] checkArray;
    static int checkSecret;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        checkArray = new int[4];
        myArray = new int[4];
        char[] A = new char[S];
        checkSecret = 0;

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArray[i] = Integer.parseInt(st.nextToken());

            if (checkArray[i] == 0) {
                checkSecret++;
            }
        }
        // 부분 문자열 처음 받을 때 확인 방법
        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }
        if (checkSecret == 4) result++;

        // 슬라이딩 윈도우 방법
        for (int i = P; i < S; i++) {
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4) result++;
        }

        System.out.println(result);
        br.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArray[0] == checkArray[0]) checkSecret--;
                myArray[0]--;
                break;
            case 'C':
                if (myArray[1] == checkArray[1]) checkSecret--;
                myArray[1]--;
                break;
            case 'G':
                if (myArray[2] == checkArray[2]) checkSecret--;
                myArray[2]--;
                break;
            case 'T':
                if (myArray[3] == checkArray[3]) checkSecret--;
                myArray[3]--;
                break;
        }
    }

    private static void Add(char c) {
            switch (c) {
                case 'A':
                    myArray[0]++;
                    if (myArray[0] == checkArray[0]) checkSecret++;
                    break;
                case 'C':
                    myArray[1]++;
                    if (myArray[1] == checkArray[1]) checkSecret++;
                    break;
                case 'G':
                    myArray[2]++;
                    if (myArray[2] == checkArray[2]) checkSecret++;
                    break;
                case 'T':
                    myArray[3]++;
                    if (myArray[3] == checkArray[3]) checkSecret++;
                    break;
            }
    }
}
