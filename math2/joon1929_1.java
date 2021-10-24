package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소수 구하기
 * 문제 : 에라토스테네스의 체를 사용하지 않고 일반 반복문을 이용해서 풀었을 때 시간 제한에 걸렸다.
 * 에라토스테네스의 체 : 소수를 판별하는 알고리즘
 * 어떤 수의 소수의 여부를 확인 할 때는, 특정한 숫자의 제곱근 까지만 약수의 여부를 검증하면 된다.
 * 가장 먼저 소수를 판별할 범위만큼 배열을 할당하여, 해당하는 값을 넣어주고, 이후에 하나씩 지워나가는 방법을 이용
 */
public class joon1929_1 {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        prime = new boolean[n+1];
        get_prime();

        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++){
            // 만약 prime[i] 가 false 이면?
            if(!prime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    // 에라토스테네스의 체 알고리즘
    public static void get_prime(){

        // true = 소수아님, false = 소수
        prime[0] = prime[1] = true;

        for(int i =2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i*i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}
