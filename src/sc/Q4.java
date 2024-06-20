package sc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number? ");
        int a = Integer.parseInt(br.readLine());

        switch (a) {
            case 1 ->System.out.println("dog");
            case 2 ->System.out.println("cat");
            case 3 -> System.out.println("chick");
            default -> System.out.println("I don't know");
        }
    }
}
