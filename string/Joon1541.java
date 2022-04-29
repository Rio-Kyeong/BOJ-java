package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 잃어버린 괄호
 */
public class Joon1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정
        StringTokenizer subtract = new StringTokenizer(br.readLine(), "-"); // 30 , 70 , 20+40, 10+100+30, 35

        while (subtract.hasMoreTokens()){
            int temp = 0;

            // 뺼셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰을 더한다.
            StringTokenizer plus = new StringTokenizer(subtract.nextToken(), "+");

            // 덧셈으로 나뉜 토큰들을 모두 더한다.
            while (plus.hasMoreTokens()){
                temp += Integer.parseInt(plus.nextToken());
            }

            // 첫 번째 토큰인 경우 temp 값이 첫 번째 수가 됨
            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
