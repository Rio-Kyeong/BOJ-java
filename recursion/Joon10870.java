package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수 5
 * 피보나치 수 : 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두항의 합인 수열
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * n = n-1 + n-2
 */
public class Joon10870 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int fibonacci = Fibonacci(n);

        System.out.println(fibonacci);
    }

    public static int Fibonacci(int n){

        if(n == 0) return 0;
        if(n == 1) return 1;

        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
