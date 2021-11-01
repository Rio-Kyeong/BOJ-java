package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소수 구하기
 * 에라토스테네스의 체 사용x
 */
public class Joon1929 {
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        make_prime(m, n);
        System.out.println(sb);
    }

    public static void make_prime(int m, int n){

        for(int i = m; i <= n; i++){

            if(i == 2){
                sb.append(2).append("\n");
            }

            for(int j = 2; j <= i-1; j++){

                if(i % j == 0){
                    break;
                }

                if(j == i-1){
                    sb.append(i).append("\n");
                }
            }
        }
    }
}
