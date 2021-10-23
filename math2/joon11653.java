package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소인수분해
 */
public class joon11653 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int idx = 2;

        while (true) {
            if(n % idx == 0){
                n /= idx;
                System.out.println(idx);
            }else {
                idx++;
            }

            if(n == 1){
                break;
            }
        }
    }
}
