package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수
 */
public class Joon2747 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a = 0, b = 1, c = 1;

        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.print(c);
    }
}
