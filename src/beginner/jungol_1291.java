package beginner;

import java.util.Scanner;

public class jungol_1291 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("2부터 9까지의 숫자 중 두개를 입력하세요");
        int s;
        int e;

        while (true) {
            s = sc.nextInt();
            e = sc.nextInt();
            if (s < 2 || s > 9 || e < 2 || e > 9) {
                System.out.println("INPUT ERROR!");
                continue;
            }
            break;
        }
        if (s >= e) {
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d =%3d", s, i, s * i);
                for (int j = 1; j <= s - e; j++) {
                    System.out.print("   ");
                    System.out.printf("%d * %d =%3d", s - j, i, (s - j) * i);
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d =%3d", s, i, s * i);
                for (int j = 1; j <= e - s; j++) {
                    System.out.print("   ");
                    System.out.printf("%d * %d =%3d", s + j, i, (s + j) * i);
                }
                System.out.println();
            }
        }
    }
}
