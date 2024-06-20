package operator2;

import java.io.*;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        //두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%d / %d = %d...%d", a, b, a/b, a%b));
        bw.flush();
        bw.close();
    }
}
