package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수 2
 */
public class Joon2748 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long sum = 1;
        long a = 0;
        long b = 1;

        for(int i = 1; i < n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }

        System.out.print(sum);
    }
}
