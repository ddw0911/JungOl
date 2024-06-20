package rc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int odd = 0;
        int even = 0;

        while (true) {
            String str = br.readLine();
            String[] result = str.split(" ");

            for (String s : result) {
                int num = Integer.parseInt(s);
                if (num == 0) {
                    System.out.println("odd = " + odd);
                    System.out.println("even = " + even);
                    break;
                }
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
    }
}