package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 설탕 배달
 */
public class Joon2839_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (true){
            if(n % 5 == 0){
               cnt += n / 5;
               System.out.println(cnt);
               break;
            }else{
               n -= 3;
               cnt++;
            }
            if(n < 0){ // 4, 7
                System.out.println(-1);
                break;
            }
        }
    }
}
