package operator;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // 정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고
        // 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + 100;
        b = b % 10;

        System.out.print(a + " " + b);
    }
}
