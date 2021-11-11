package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 분해합
 */
public class Joon2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i <= n; i++){
            int number = i;
            int sum = 0; // 각 자릿수의 합

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == n){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
