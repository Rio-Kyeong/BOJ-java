package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 베르트랑 공준
 */
public class Joon4948 {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            int n = Integer.parseInt(br.readLine());
            int cnt = 0;

            if(n == 0){
                break;
            }

            prime = new boolean[2*n+1];
            get_prime();

            for(int i = n+1; i <= 2*n; i++){
                if(!prime[i]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    public static void get_prime(){
        // false = 소수
        prime[0] = prime[1] = true;

        for(int i =2; i < Math.sqrt(prime.length); i++){
            if(prime[i]) continue;

            for(int j = i*i; j < prime.length; j+=i){
                prime[j] = true;
            }
        }
    }
}
