public class Jungsuk {

    public static void main(String[] args) {
        Jungsuk jungsuk = new Jungsuk();

        jungsuk.calQ1(15);
        jungsuk.calQ2('\t');
        jungsuk.calQ3('x');
        jungsuk.calQ4('7');
        jungsuk.calQ5('A');
        jungsuk.calQ6(400);
        jungsuk.calQ7(false);
        jungsuk.calQ8("yes");

        jungsuk.calQ9(1, 20);
        jungsuk.cal10(10);
        jungsuk.cal11();
        jungsuk.cal12();
        jungsuk.cal13();
        jungsuk.cal14();
        jungsuk.cal15();
        jungsuk.cal16();
        jungsuk.cal17();
    }

    void calQ1(int x) {
        boolean result = x > 10 && x < 20;
        System.out.println(result);
    }

    void calQ2(char ch) {
        boolean result = ch != 10 && ch != '\t';
        System.out.println(result);
    }

    void calQ3(char ch) {
        boolean result = ch == 'x' || ch == 'X';
        System.out.println(result);
    }

    void calQ4(char ch) {
        boolean result = ch >= '0' && ch <= '9';
        // boolean result = ch - '0' > 0 && ch - '9 < 0;
        System.out.println(result);
    }

    void calQ5(char ch) {
        boolean result = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        // boolean result = ch - 'A'
        System.out.println(result);
    }

    void calQ6(int year) {
        boolean result = year % 400 == 0 || (year % 400 == 0 && year % 100 != 0);
        System.out.println(result);
    }

    void calQ7(boolean powerOn) {
        boolean result = powerOn == false;
        System.out.println(result);
    }

    void calQ8(String str) {
        boolean result = str == "yes";
        System.out.println(result);
    }

    void calQ9(int a, int b) {
        int result = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                result += i;
            }
        }
        System.out.println(result);
    }

    void cal10(int end) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                result += j;
            }
        }
        System.out.println(result);
    }

    void cal11() {
        int sum = 0;
        for (int i = 1; ; i++) {
            if (i % 2 == 1) {
                sum += i;
            } else {
                sum -= i;
            }
            if (sum >= 100) {
                System.out.println(i);
                break;
            }
        }
    }

    void cal12() {
//    for (int i = 0; i <= 10; i++) { // 11번 줄바꿈
//      for (int j = 0; j <= i; j++) // * 찍기
//        System.out.print("*");
//      System.out.println();
//    }
        int i = 0;
        int j = 0;

        while (i <= 10) {
            j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    void cal13() {
        int x = 0;
        int y = 0;
        for (x = 1; x <= 6; x++) {
            for (y = 1; y <= 6; y++) {
                int sum = x + y;
                if (sum == 6) {
                    System.out.println("합이 6이 되는 경우: " + x + " 과 " + y);
                }
            }
        }
    }

    void cal14() {
        String str = "12345";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(Character.toString(str.charAt(i)));
        }
        System.out.println("sum=" + sum);
    }

    void cal15() {
        int value = (int) (Math.random() * 6) + 1;
        System.out.println("value:" + value);
    }

    void cal16() {
        int num = 623237982;
        int sum = 0;

        while (true) {
            sum += num % 10;
            num = num / 10;

            if (num == 0) {
                break;
            }
        }
        System.out.println("sum=" + sum);
    }

    void cal17() {
        // 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수
        // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
            if (input == answer) {
                System.out.print("시도횟수는 " + count + "번입니다.");
                break;
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            } else {
                System.out.println("더 큰 수를 입력하세요");
            }
        } while (true);
    }
}
