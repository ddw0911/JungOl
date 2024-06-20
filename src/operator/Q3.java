package operator;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // 한 개의 정수를 입력 받아서 후치증가 연산자를 사용하여 출력한 후
        // 전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(a++);
        System.out.print(++a);
    }
}
