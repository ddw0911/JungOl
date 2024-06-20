package operator;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // 2개의 정수를 입력 받아서 0이 아니면 참(true), 0이면 거짓(false)으로 처리하고
        //
        //두 값의 논리곱과 논리합의 결과를 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print((a * b != 0) + " " + (a + b != 0));
    }
}
