package operator;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // 두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
        //
        //이때 입력받은 두 정수를 이용하여 출력하시오.
        //
        //(JAVA는 1이면 true, 0이면 false를 출력한다.)

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d > %d --- %s\n", a, b, a > b);
        System.out.printf("%d < %d --- %s\n", a, b, a < b);
        System.out.printf("%d >= %d --- %s\n", a, b, a >= b);
        System.out.printf("%d <= %d --- %s\n", a, b, a <= b);
    }
}
