package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최대공약수와 최소공배수
 * 유클리드 호제법
 * GCD(a, b) = GCD(b, r), r = a % b
 * ex) GCD(24, 18) = GCD(18, 6) = GCD(6, 0)
 * 최대공약수 : 6
 */
public class Joon2609 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.print(gcd(a, b) + "\n");
        System.out.print(lcm(a, b));
    }

    // 최대공약수
    public static int gcd(int a, int b){
        while (true){
            if(b != 0){
                int r = a % b;
                a = b;
                b = r;
            }else {
                break;
            }
        }
        return a;
    }

    // 최소공배수
    public static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }
}
