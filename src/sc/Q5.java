package sc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.time.YearMonth;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        switch (a) {
            case 1, 3, 5, 6, 7, 8, 10, 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            default:
                System.out.println("30");
                break;
        }
    }
}
