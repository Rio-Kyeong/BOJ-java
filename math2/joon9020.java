package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 골드바흐의 추측
 * 짝수 n을 절반을 나누어서 검사하였다.
 */
public class joon9020 {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());

            prime = new boolean[n+1];
            get_prime(); // false : 소수

            int p = n / 2;
            int q = n / 2;

            while(true) {
                if (!prime[p] && !prime[q]) {
                    System.out.println(p + " " + q);
                    break;
                } else {
                    p--;
                    q++;
                }
            }
        }
    }

    public static void get_prime(){

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;

            for(int j = i*i; j < prime.length; j+=i){
                prime[j] = true;
            }
        }
    }
}
