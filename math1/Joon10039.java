package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 평균 점수
 */
public class Joon10039 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for(int i = 0; i < 5; i++){
            int fail = Integer.parseInt(br.readLine());
            if(fail < 40){
                fail = 40;
            }
            sum += fail;
        }
        System.out.print(sum / 5);
    }
}
