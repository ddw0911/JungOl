package rc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            if (i == a) {
                System.out.print(i);
                break;
            }
            System.out.print(i + " ");
        }
    }
}
