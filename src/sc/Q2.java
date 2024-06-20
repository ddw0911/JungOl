package sc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        if (a > 0) {
            System.out.println("plus");
        } else if (a == 0) {
            System.out.println("zero");
        } else {
            System.out.println("minus");
        }
    }
}
