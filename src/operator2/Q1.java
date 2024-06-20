package operator2;

import java.io.*;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String[] args) throws IOException {
        //국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서
        // 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        br.close();

        bw.write("sum " + (a+b+c+d) + "\n");
        // bw.newLine();
        bw.write("avg " + (a+b+c+d)/4);
//        bw.flush();
        bw.close();
    }
}
