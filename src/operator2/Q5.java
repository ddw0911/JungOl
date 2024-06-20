package operator2;

import java.io.*;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {
//        민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
//
//        (JAVA는 1 이면 true, 0 이면 false를 출력한다.)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%b", a > c && b > d));
        //bw.write(a > c && b > d ? "true" : "false")
        bw.flush();
        bw.close();
    }
}
