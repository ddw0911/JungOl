package operator2;

import java.io.*;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {
        //직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후
        //가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후
        //가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        a = a + 5;
        b = b * 2;
        br.close();

        bw.write("width = " + a);
        bw.newLine();
        bw.write("length = " + b);
        bw.newLine();
        bw.write("area = " + a*b);
        bw.flush();
        bw.close();
    }
}
