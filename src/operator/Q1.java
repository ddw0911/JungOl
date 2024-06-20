package operator;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int avg = sum / 3;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}
