package operator;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // 3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고
        // 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
        //
        //(JAVA는 1이면 true, 0이면 false를 출력한다.)

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print((a > b && a > c) + " " + (a == b && b == c));
    }
}
