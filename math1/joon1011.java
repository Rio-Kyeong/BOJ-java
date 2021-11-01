package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Fly me to the Alpha Centauri
 * reference : https://st-lab.tistory.com/79
 */
public class Joon1011 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 한 번에 출력

        int t = Integer.parseInt(br.readLine()); // Test Case

        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken()); // 현재 위치 x
            int y = Integer.parseInt(st.nextToken()); // 목표 위치 y

            int distance = y - x;
            int max = (int)Math.sqrt(distance); // 최대 광년은 거리의 제곱근(루트) 값에서 소수점을 버린 정수 값

            if(max == Math.sqrt(distance)){ // 만약 정수부분만 취한 값과, 소수점까지 취한 값이 같다면?
                sb.append(max * 2 - 1).append("\n");
            }
            else if (distance <= max * max + max){
                sb.append(max * 2).append("\n");
            }
            else{
                sb.append(max * 2 + 1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
